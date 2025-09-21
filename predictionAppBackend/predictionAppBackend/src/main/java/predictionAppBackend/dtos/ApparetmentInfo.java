package predictionAppBackend.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApparetmentInfo {

        @JsonProperty("MSSubClass")
        private int MSSubClass;

        @JsonProperty("MSZoning")
        private int MSZoning;

        @JsonProperty("LotFrontage")
        private int LotFrontage;

        @JsonProperty("LotArea")
        private int LotArea;

        @JsonProperty("Street")
        private int Street;

        @JsonProperty("Alley")
        private int Alley;

        @JsonProperty("LotShape")
        private int LotShape;

        @JsonProperty("LandContour")
        private int LandContour;

        @JsonProperty("Utilities")
        private int Utilities;

        @JsonProperty("LandSlope")
        private int LandSlope;

        @JsonProperty("Neighborhood")
        private int Neighborhood;

        @JsonProperty("Condition1")
        private int Condition1;

        @JsonProperty("Condition2")
        private int Condition2;

        @JsonProperty("BldgType")
        private int BldgType;

        @JsonProperty("HouseStyle")
        private int HouseStyle;

        @JsonProperty("OverallQual")
        private int OverallQual;

        @JsonProperty("OverallCond")
        private int OverallCond;

        @JsonProperty("YearBuilt")
        private int YearBuilt;

        @JsonProperty("YearRemodAdd")
        private int YearRemodAdd;

        @JsonProperty("RoofStyle")
        private int RoofStyle;

        @JsonProperty("RoofMatl")
        private int RoofMatl;

        @JsonProperty("Exterior1st")
        private int Exterior1st;

        @JsonProperty("Exterior2nd")
        private int Exterior2nd;

        @JsonProperty("MasVnrType")
        private int MasVnrType;

        @JsonProperty("MasVnrArea")
        private int MasVnrArea;

        @JsonProperty("ExterQual")
        private int ExterQual;

        @JsonProperty("ExterCond")
        private int ExterCond;

        @JsonProperty("Foundation")
        private int Foundation;

        @JsonProperty("BsmtQual")
        private int BsmtQual;

        @JsonProperty("BsmtCond")
        private int BsmtCond;

        @JsonProperty("BsmtExposure")
        private int BsmtExposure;

        @JsonProperty("BsmtFinType1")
        private int BsmtFinType1;

        @JsonProperty("BsmtFinSF1")
        private int BsmtFinSF1;

        @JsonProperty("BsmtFinType2")
        private int BsmtFinType2;

        @JsonProperty("BsmtFinSF2")
        private int BsmtFinSF2;

        @JsonProperty("BsmtUnfSF")
        private int BsmtUnfSF;

        @JsonProperty("TotalBsmtSF")
        private int TotalBsmtSF;

        @JsonProperty("Heating")
        private int Heating;

        @JsonProperty("HeatingQC")
        private int HeatingQC;

        @JsonProperty("CentralAir")
        private int CentralAir;

        @JsonProperty("Electrical")
        private int Electrical;

        @JsonProperty("LowQualFinSF")
        private int LowQualFinSF;

        @JsonProperty("GrLivArea")
        private int GrLivArea;

        @JsonProperty("BsmtFullBath")
        private int BsmtFullBath;

        @JsonProperty("BsmtHalfBath")
        private int BsmtHalfBath;

        @JsonProperty("FullBath")
        private int FullBath;

        @JsonProperty("HalfBath")
        private int HalfBath;

        @JsonProperty("BedroomAbvGr")
        private int BedroomAbvGr;

        @JsonProperty("KitchenAbvGr")
        private int KitchenAbvGr;

        @JsonProperty("KitchenQual")
        private int KitchenQual;

        @JsonProperty("TotRmsAbvGrd")
        private int TotRmsAbvGrd;

        @JsonProperty("Functional")
        private int Functional;

        @JsonProperty("Fireplaces")
        private int Fireplaces;

        @JsonProperty("FireplaceQu")
        private int FireplaceQu;

        @JsonProperty("GarageType")
        private int GarageType;

        @JsonProperty("GarageYrBlt")
        private Double GarageYrBlt;

        @JsonProperty("GarageFinish")
        private int GarageFinish;

        @JsonProperty("GarageCars")
        private int GarageCars;

        @JsonProperty("GarageArea")
        private int GarageArea;

        @JsonProperty("GarageQual")
        private int GarageQual;

        @JsonProperty("GarageCond")
        private int GarageCond;

        @JsonProperty("PavedDrive")
        private int PavedDrive;

        @JsonProperty("WoodDeckSF")
        private int WoodDeckSF;

        @JsonProperty("OpenPorchSF")
        private int OpenPorchSF;

        @JsonProperty("EnclosedPorch")
        private int EnclosedPorch;

        @JsonProperty("ScreenPorch")
        private int ScreenPorch;

        @JsonProperty("PoolArea")
        private int PoolArea;

        @JsonProperty("PoolQC")
        private int PoolQC;

        @JsonProperty("Fence")
        private int Fence;

        @JsonProperty("MiscFeature")
        private int MiscFeature;

        @JsonProperty("MiscVal")
        private int MiscVal;

        @JsonProperty("MoSold")
        private int MoSold;

        @JsonProperty("YrSold")
        private int YrSold;

        @JsonProperty("SaleType")
        private int SaleType;

        @JsonProperty("SaleCondition")
        private int SaleCondition;

        // Getters et setters (ou utilise Lombok si tu veux générer automatiquement)
}
