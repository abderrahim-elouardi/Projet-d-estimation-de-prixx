import { ActivatedRouteSnapshot, CanActivate, CanActivateFn, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Auth } from './service/auth';
import { Observable } from 'rxjs';

export class AuthGuard implements CanActivate {

  constructor(private authService: Auth, private router: Router) { }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

    if (this.authService.jwtToken != null) {
      return true; // L'utilisateur est connecté, l'accès est autorisé
    } else {
      // L'utilisateur n'est pas connecté, on le redirige vers la page de connexion
      return this.router.createUrlTree(['/seConecter']);
    }
  }
}
