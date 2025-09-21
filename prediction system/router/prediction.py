from fastapi import APIRouter
from joblib import load
import os
from typing import Optional
from pydantic import BaseModel
import pandas as pd
from fastapi import Depends
from databaseForm.schemas import User
from router.oauth22 import get_current_user

class AmesHouse(BaseModel):
    MSSubClass: int
    MSZoning: int
    LotFrontage: int
    LotArea: int
    Street: int
    Alley: int
    LotShape: int
    LandContour: int
    Utilities: int
    LandSlope: int
    Neighborhood: int
    Condition1: int
    Condition2: int
    BldgType: int
    HouseStyle: int
    OverallQual: int
    OverallCond: int
    YearBuilt: int
    YearRemodAdd: int
    RoofStyle: int
    RoofMatl: int
    Exterior1st: int
    Exterior2nd: int
    MasVnrType: int
    MasVnrArea: int
    ExterQual: int
    ExterCond: int
    Foundation: int
    BsmtQual: int
    BsmtCond: int
    BsmtExposure: int
    BsmtFinType1: int
    BsmtFinSF1: int
    BsmtFinType2: int
    BsmtFinSF2: int
    BsmtUnfSF: int
    TotalBsmtSF: int
    Heating: int
    HeatingQC: int
    CentralAir: int
    Electrical: int
    LowQualFinSF: int
    GrLivArea: int
    BsmtFullBath: int
    BsmtHalfBath: int
    FullBath: int
    HalfBath: int
    BedroomAbvGr: int
    KitchenAbvGr: int
    KitchenQual: int
    TotRmsAbvGrd: int
    Functional: int
    Fireplaces: int
    FireplaceQu: int
    GarageType: int
    GarageYrBlt: Optional[float]
    GarageFinish: int
    GarageCars: int
    GarageArea: int
    GarageQual: int
    GarageCond: int
    PavedDrive: int
    WoodDeckSF: int
    OpenPorchSF: int
    EnclosedPorch: int
    ScreenPorch: int
    PoolArea: int
    PoolQC: int
    Fence: int
    MiscFeature: int
    MiscVal: int
    MoSold: int
    YrSold: int
    SaleType: int
    SaleCondition: int




router = APIRouter()




@router.post("/prediction")
def prediction(house:AmesHouse,currentUser : User = Depends(get_current_user)):
    current_dir = os.path.dirname(__file__)  # répertoire du fichier prediction.py
    model_path = os.path.join(current_dir, "predectionModel2.joblib")
    model = load(model_path)


    house_dict = house.dict()  # convertit en dict
    house_df = pd.DataFrame([house_dict])  # DataFrame 1 ligne

    prediction = model.predict(house_df)[0]

    return {"prediction" : prediction}

