import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Auth } from '../service/auth';
import { Router } from '@angular/router';

@Component({
  selector: 'app-se-connecter',
  imports: [FormsModule],
  templateUrl: './se-connecter.html',
  styleUrl: './se-connecter.css'
})
export class SeConnecter {


  userInfo: { username: string | null, password: string | null } = { username: null, password: null }

  constructor(public auth: Auth, private router: Router) {


  }

  seConnecter() {
    if (this.userInfo.username != null && this.userInfo.password != null) {

      this.auth.seConnecter(this.userInfo).subscribe({
        next: (response: { accec_token: string }) => {
          console.log(response);
          this.auth.jwtToken = response.accec_token;
          this.router.navigate(['/estimateur'])
        },
        error: (error) => {
          console.log(error);

        }
      })
    }

  }

}
