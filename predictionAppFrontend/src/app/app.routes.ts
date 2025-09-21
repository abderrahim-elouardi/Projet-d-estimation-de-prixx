import { Routes } from '@angular/router';
import { Home } from './home/home';
import { Estimateur } from './estimateur/estimateur';
import { SeConnecter } from './se-connecter/se-connecter';
import { AuthGuard } from './auth-guard-guard';

export const routes: Routes = [
    {
        path: '',
        component: Home
    },
    {
        path: 'home',
        component: Home
    }, {
        path: 'seConecter',
        component: SeConnecter
    },
    {
        path: 'estimateur',
        component: Estimateur,
        canActivate: [AuthGuard]
    }
];
