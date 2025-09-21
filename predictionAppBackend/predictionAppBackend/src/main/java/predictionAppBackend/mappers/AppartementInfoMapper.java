package predictionAppBackend.mappers;

import predictionAppBackend.dtos.ApparetmentInfo;
import predictionAppBackend.entites.ApparetmentInfoEntite;

public class AppartementInfoMapper {
        public static ApparetmentInfoEntite convertToEntity(ApparetmentInfo info) {
            if (info == null) {
                return null;
            }

            ApparetmentInfoEntite entity = new ApparetmentInfoEntite();

            // Copie de tous les attributs communs
            entity.setMSSubClass(info.getMSSubClass());
            entity.setMSZoning(info.getMSZoning());
            entity.setLotFrontage(info.getLotFrontage());
            entity.setLotArea(info.getLotArea());
            entity.setStreet(info.getStreet());
            entity.setAlley(info.getAlley());
            entity.setLotShape(info.getLotShape());
            entity.setLandContour(info.getLandContour());
            entity.setUtilities(info.getUtilities());
            entity.setLandSlope(info.getLandSlope());
            entity.setNeighborhood(info.getNeighborhood());
            entity.setCondition1(info.getCondition1());
            entity.setCondition2(info.getCondition2());
            entity.setBldgType(info.getBldgType());
            entity.setHouseStyle(info.getHouseStyle());
            entity.setOverallQual(info.getOverallQual());
            entity.setOverallCond(info.getOverallCond());
            entity.setYearBuilt(info.getYearBuilt());
            entity.setYearRemodAdd(info.getYearRemodAdd());
            entity.setRoofStyle(info.getRoofStyle());
            entity.setRoofMatl(info.getRoofMatl());
            entity.setExterior1st(info.getExterior1st());
            entity.setExterior2nd(info.getExterior2nd());
            entity.setMasVnrType(info.getMasVnrType());
            entity.setMasVnrArea(info.getMasVnrArea());
            entity.setExterQual(info.getExterQual());
            entity.setExterCond(info.getExterCond());
            entity.setFoundation(info.getFoundation());
            entity.setBsmtQual(info.getBsmtQual());
            entity.setBsmtCond(info.getBsmtCond());
            entity.setBsmtExposure(info.getBsmtExposure());
            entity.setBsmtFinType1(info.getBsmtFinType1());
            entity.setBsmtFinSF1(info.getBsmtFinSF1());
            entity.setBsmtFinType2(info.getBsmtFinType2());
            entity.setBsmtFinSF2(info.getBsmtFinSF2());
            entity.setBsmtUnfSF(info.getBsmtUnfSF());
            entity.setTotalBsmtSF(info.getTotalBsmtSF());
            entity.setHeating(info.getHeating());
            entity.setHeatingQC(info.getHeatingQC());
            entity.setCentralAir(info.getCentralAir());
            entity.setElectrical(info.getElectrical());
            entity.setLowQualFinSF(info.getLowQualFinSF());
            entity.setGrLivArea(info.getGrLivArea());
            entity.setBsmtFullBath(info.getBsmtFullBath());
            entity.setBsmtHalfBath(info.getBsmtHalfBath());
            entity.setFullBath(info.getFullBath());
            entity.setHalfBath(info.getHalfBath());
            entity.setBedroomAbvGr(info.getBedroomAbvGr());
            entity.setKitchenAbvGr(info.getKitchenAbvGr());
            entity.setKitchenQual(info.getKitchenQual());
            entity.setTotRmsAbvGrd(info.getTotRmsAbvGrd());
            entity.setFunctional(info.getFunctional());
            entity.setFireplaces(info.getFireplaces());
            entity.setFireplaceQu(info.getFireplaceQu());
            entity.setGarageType(info.getGarageType());
            entity.setGarageYrBlt(info.getGarageYrBlt());
            entity.setGarageFinish(info.getGarageFinish());
            entity.setGarageCars(info.getGarageCars());
            entity.setGarageArea(info.getGarageArea());
            entity.setGarageQual(info.getGarageQual());
            entity.setGarageCond(info.getGarageCond());
            entity.setPavedDrive(info.getPavedDrive());
            entity.setWoodDeckSF(info.getWoodDeckSF());
            entity.setOpenPorchSF(info.getOpenPorchSF());
            entity.setEnclosedPorch(info.getEnclosedPorch());
            entity.setScreenPorch(info.getScreenPorch());
            entity.setPoolArea(info.getPoolArea());
            entity.setPoolQC(info.getPoolQC());
            entity.setFence(info.getFence());
            entity.setMiscFeature(info.getMiscFeature());
            entity.setMiscVal(info.getMiscVal());
            entity.setMoSold(info.getMoSold());
            entity.setYrSold(info.getYrSold());
            entity.setSaleType(info.getSaleType());
            entity.setSaleCondition(info.getSaleCondition());

            return entity;
        }

}
