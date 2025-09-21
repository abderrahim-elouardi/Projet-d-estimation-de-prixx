from fastapi import APIRouter,Depends , HTTPException ,status
from databaseForm import schemas ,database,models
from sqlalchemy.orm import Session
from router.hashing import pwd_cxt
from .token import *
from datetime import timedelta
from fastapi.security import OAuth2PasswordRequestForm
from databaseForm.schemas import User
router = APIRouter(
    tags=["authentication"]
)





@router.post("/login")
def login(userr:User ,db:Session =Depends(database.get_db)):
    user = db.query(models.users).filter(models.users.username == userr.username).first()
    if not user or not pwd_cxt.verify(userr.password,user.password):
        raise HTTPException(status_code= 401 , detail= "les information sont incorrect ")

    #generation de jwt token 
    acces_token = create_access_token(data = {"sub":user.username})
    return {"access_token":acces_token,"token_type":"bearer"}