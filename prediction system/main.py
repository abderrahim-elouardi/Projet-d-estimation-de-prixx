from fastapi import FastAPI
from router import prediction , authentication
from databaseForm import models
from databaseForm.database import engine 

from databaseForm.database import get_db
from passlib.context import CryptContext 





app = FastAPI()



pwd_cxt = CryptContext(schemes=["bcrypt"], deprecated= "auto")

# Données de l'utilisateur initial
INITIAL_USER = {
    "username": "abderrahimelouardi@gmail.com",
    "password": "elouardi123"
}

def create_initial_user():
    db = next(get_db())
    try:
        # Vérifie si l'utilisateur existe déjà
        existing_user = db.query(models.users).filter(
            models.users.username == INITIAL_USER["username"]
        ).first()
        
        if not existing_user:
            # Crée le nouvel utilisateur
            hashed_password = pwd_cxt.hash(INITIAL_USER["password"])
            new_user = models.users(
                username=INITIAL_USER["username"],
                password=hashed_password
            )
            db.add(new_user)
            db.commit()
            print("✔ Utilisateur initial créé avec succès")
        else:
            print("ℹ Utilisateur initial existe déjà")
    except Exception as e:
        db.rollback()
        print(f"⚠ Erreur lors de la création de l'utilisateur initial: {e}")
    finally:
        db.close()

if __name__=='__main__':
    create_initial_user()


# Vos routes existantes
app.include_router(prediction.router)
app.include_router(authentication.router)

# Création des tables
models.Base.metadata.create_all(bind=engine)