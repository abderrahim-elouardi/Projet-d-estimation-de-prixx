package predictionAppBackend.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.stereotype.Service;
import predictionAppBackend.entites.Utilisateur;
import predictionAppBackend.repositorys.UtilisateurRepository;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuthenticationService {

    private final JwtEncoder jwtEncoder;
    private JwtDecoder jwtDecoder;
    private final AuthenticationManager authenticationManager;
    private UtilisateurRepository UR;

    @Value("${jwt.timeExpairation}")
    private int timeExpairation;

    public AuthenticationService(JwtEncoder jwtEncoder, JwtDecoder jwtDecoder, AuthenticationManager authenticationManager,UtilisateurRepository UR) {
        this.jwtEncoder = jwtEncoder;
        this.jwtDecoder = jwtDecoder;
        this.authenticationManager = authenticationManager;
        this.UR=UR;
    }

    public ResponseEntity<Map<String, String>> getToken(String username, String password) {
        Authentication authentication=null;
        String subject=null;
        String scope=null;
        Map<String ,String> idToken=new HashMap<>();
        authentication=authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        subject=authentication.getName();
        scope=authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(" "));
        Instant instant=Instant.now();
        Utilisateur user=UR.findByUsername(subject).get();
        JwtClaimsSet jwtClaimSet= JwtClaimsSet.builder()
                .subject(subject)
                .issuedAt(instant)
                .expiresAt(instant.plus(timeExpairation, ChronoUnit.MINUTES))
                .claim("scope",scope)
                .build();

        JwtEncoderParameters jwtEncoderParameters=JwtEncoderParameters.from(
                JwsHeader.with(MacAlgorithm.HS512).build(),
                jwtClaimSet
        );

        Jwt jwt=jwtEncoder.encode(jwtEncoderParameters);
        String jwtString=jwt.getTokenValue();

        idToken.put("accec_token",jwtString);
        return new ResponseEntity<>(idToken, HttpStatus.OK);
    }
}