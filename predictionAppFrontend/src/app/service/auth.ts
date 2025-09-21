import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class Auth {
  jwtToken: string | null = null;
  localAdress: string = 'http://localhost:9090/'
  constructor(private http: HttpClient) {

  }
  seConnecter(userInfo: { username: string | null, password: string | null }): Observable<{ accec_token: string }> {
    return this.http.post<{ accec_token: string }>(this.localAdress + "auth", userInfo);
  }
}
