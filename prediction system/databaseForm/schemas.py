from pydantic import BaseModel


#utiliser l'heur de l'envoi de doner de client vers le serveur  
class Etudiant(BaseModel):
    cne:str



#utiliser l'heur de la recuperation de donnees 
class EtudiantForDisplay(Etudiant):
    class Config():
        from_attributes = True #pour traduire un objet de sqlAlQmy vers un objet de sortie


class User(BaseModel):
    username:str
    password:str

class Login(BaseModel):
    username:str
    password:str

# les schema pour jwt
class Token(BaseModel):
    access_token: str
    token_type: str


class TokenData(BaseModel):
    username: str | None = None