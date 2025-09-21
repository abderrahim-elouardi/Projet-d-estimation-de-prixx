// auth-interceptor.ts
import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { Auth } from "./service/auth";

export const authInterceptor: HttpInterceptorFn = (req, next) => {
    const auth = inject(Auth);

    if (!req.url.includes('/auth')) {
        const modifiedReq = req.clone({
            setHeaders: {
                Authorization: `Bearer ${auth.jwtToken}`,
                'Content-Type': 'application/json'
            }
        });
        return next(modifiedReq);
    }
    return next(req);
};