from sqlalchemy import create_engine
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

#c'est le premiere fichier que je doit creer pour se connecter a une base de donnees sqlite

#connection a la base de donnees
SQL_DATABASE_URL = "sqlite:///databaseForm\\physiqueDatabase.db"
connect_args = {"check_same_thread": False}#sqlite ne laisse pas plusieur thread utilise la meme connexion et cette instruction dit a sqlite de laisse moi faire ca a je vais gerer les consequences
engine = create_engine(SQL_DATABASE_URL, connect_args=connect_args)




#creation de la session
SessionLocal = sessionmaker(bind=engine,autocommit=False,autoflush=False)

#creation de la base (c'est un classe ou tout les classe modeles vent herite pour realiser l'ORM)
Base = declarative_base()

def get_db():
    db = SessionLocal()
    try:
        yield db
    finally:
        db.close()

