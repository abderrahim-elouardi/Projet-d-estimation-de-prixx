package predictionAppBackend.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import predictionAppBackend.dtos.UserInfo;
import predictionAppBackend.services.AuthenticationService;

import java.util.Map;

@RestController
public class AuthenticationController {


    private AuthenticationService AS;


    public AuthenticationController(AuthenticationService AS) {
        this.AS = AS;
    }


    //pour recuperer l'authentifier
    @GetMapping("/getAuth")
    public Authentication getAuth(Authentication authentication){
        return authentication;
    }

    //pour s'authentifier
    @PostMapping("/auth")
    public ResponseEntity<Map<String ,String>> getToken(@RequestBody UserInfo userInfo){
        return AS.getToken(userInfo.getUsername(), userInfo.getPassword());
    }

}