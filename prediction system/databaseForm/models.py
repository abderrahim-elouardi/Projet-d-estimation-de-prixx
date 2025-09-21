from .database import Base
from sqlalchemy import Column,Integer,String



class users(Base):
    __tablename__ = "users"
    id = Column(Integer,primary_key=True)
    username = Column(String)
    password = Column(String)

