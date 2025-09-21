import { Component } from '@angular/core';
import { EstimationService } from '../service/estimation-service';
import { NgIf } from '@angular/common';
import { Router } from '@angular/router';
import { Auth } from '../service/auth';
@Component({
  selector: 'app-navbar',
  standalone: true,
  imports: [NgIf],
  templateUrl: './navbar.html',
  styleUrl: './navbar.css'
})
export class Navbar {

  constructor(public auth: Auth, private router: Router) {

  }

  allerEstimateur() {
    this.router.navigate(['/estimateur']);

  }



  AllerDeconnecter() {
    this.auth.jwtToken = null
    this.router.navigate(['/home']);

  }

  AllerSeConnecter() {
    this.router.navigate(['/seConecter']);
  }
}
