import { Component } from '@angular/core';
import { ApparetmentInfo } from '../dtos/export class ApparetmentInfo {';
import { FormsModule } from '@angular/forms';
import { NgIf } from '@angular/common';
import { EstimationService } from '../service/estimation-service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-estimateur',
  imports: [FormsModule, NgIf],
  templateUrl: './estimateur.html',
  styleUrl: './estimateur.css'
})
export class Estimateur {
  appInfo: ApparetmentInfo = new ApparetmentInfo();
  chargementbutton: boolean = false;

  // apartmentData1: ApparetmentInfo = {
  //   MSSubClass: 20,
  //   MSZoning: 3,
  //   LotFrontage: 80,
  //   LotArea: 9600,
  //   Street: 1,
  //   Alley: 0,
  //   LotShape: 2,
  //   LandContour: 1,
  //   Utilities: 1,
  //   LandSlope: 1,
  //   Neighborhood: 5,
  //   Condition1: 1,
  //   Condition2: 1,
  //   BldgType: 2,
  //   HouseStyle: 1,
  //   OverallQual: 7,
  //   OverallCond: 5,
  //   YearBuilt: 2003,
  //   YearRemodAdd: 2003,
  //   RoofStyle: 1,
  //   RoofMatl: 1,
  //   Exterior1st: 3,
  //   Exterior2nd: 3,
  //   MasVnrType: 1,
  //   MasVnrArea: 196,
  //   ExterQual: 3,
  //   ExterCond: 3,
  //   Foundation: 2,
  //   BsmtQual: 3,
  //   BsmtCond: 3,
  //   BsmtExposure: 1,
  //   BsmtFinType1: 2,
  //   BsmtFinSF1: 706,
  //   BsmtFinType2: 0,
  //   BsmtFinSF2: 0,
  //   BsmtUnfSF: 150,
  //   TotalBsmtSF: 856,
  //   Heating: 1,
  //   HeatingQC: 4,
  //   CentralAir: 1,
  //   Electrical: 1,
  //   LowQualFinSF: 0,
  //   GrLivArea: 1710,
  //   BsmtFullBath: 1,
  //   BsmtHalfBath: 0,
  //   FullBath: 2,
  //   HalfBath: 1,
  //   BedroomAbvGr: 3,
  //   KitchenAbvGr: 2,
  //   KitchenQual: 3,
  //   TotRmsAbvGrd: 0,
  //   Functional: 1,
  //   Fireplaces: 1,
  //   FireplaceQu: 3,
  //   GarageType: 2,
  //   GarageYrBlt: 2003,
  //   GarageFinish: 1,
  //   GarageCars: 2,
  //   GarageArea: 548,
  //   GarageQual: 3,
  //   GarageCond: 3,
  //   PavedDrive: 1,
  //   WoodDeckSF: 0,
  //   OpenPorchSF: 61,
  //   EnclosedPorch: 0,
  //   ScreenPorch: 0,
  //   PoolArea: 0,
  //   PoolQC: 0,
  //   Fence: 0,
  //   MiscFeature: 0,
  //   MiscVal: 0,
  //   MoSold: 2,
  //   YrSold: 2008,
  //   SaleType: 1,
  //   SaleCondition: 1
  // };

  prediction: { prediction: number } = { prediction: 0 }
  predictionExist: boolean = false;
  errorMessage: string = ''
  messageErrorExiste: boolean = false

  constructor(private estimateurService: EstimationService) {

  }
  estimerPrix() {
    this.chargementbutton = true;
    this.estimateurService.estimerPrix(this.appInfo).subscribe({
      next: (response: { prediction: number }) => {
        console.log(response);
        this.prediction = response;
        this.predictionExist = true


      },
      error: (erorr: HttpErrorResponse) => {

        this.errorMessage = erorr.message
        this.messageErrorExiste = true


      }
    })
    this.chargementbutton = false;
  }
}
