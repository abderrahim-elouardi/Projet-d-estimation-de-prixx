import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ApparetmentInfo } from '../dtos/export class ApparetmentInfo {';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EstimationService {
  apiAdreesprin: string = "http://localhost:9090/"
  constructor(private http: HttpClient) {

  }
  estimerPrix(appInfo: ApparetmentInfo): Observable<{ prediction: number }> {
    return this.http.post<{ prediction: number }>(this.apiAdreesprin + "getPrediction", appInfo)
  }

}
