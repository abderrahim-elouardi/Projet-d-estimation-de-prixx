package predictionAppBackend.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import predictionAppBackend.dtos.ApparetmentInfo;
import predictionAppBackend.dtos.AuthenticationPredictionSystem;
import predictionAppBackend.dtos.PredictionResponse;
import predictionAppBackend.dtos.UserInfo;
import predictionAppBackend.entites.Prediction;
import predictionAppBackend.entites.Utilisateur;
import predictionAppBackend.mappers.AppartementInfoMapper;
import predictionAppBackend.repositorys.PredictionRepository;
import predictionAppBackend.repositorys.UtilisateurRepository;

import java.util.Map;
import java.util.Optional;

@Service
public class PredireService {

    UtilisateurRepository UR;
    PredictionRepository PR;

    public PredireService(UtilisateurRepository UR, PredictionRepository PR) {
        this.UR = UR;
        this.PR = PR;
    }

    public PredictionResponse getPredection(ApparetmentInfo appInfo, Authentication authentication) {
        RestTemplate restTemplate = new RestTemplate();

        // Adresse de l'API FastAPI
        String url1 = "http://localhost:8000/login";
        String url = "http://localhost:8000/prediction";

        UserInfo user = new UserInfo();
        user.setUsername("abderrahimelouardi@gmail.com");
        user.setPassword("elouardi123");

        /// /////
        HttpHeaders headers1 = new HttpHeaders();
        headers1.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserInfo> entity1 = new HttpEntity<>(user,headers1);
        ResponseEntity<AuthenticationPredictionSystem> response1 = restTemplate.postForEntity(url1,entity1, AuthenticationPredictionSystem.class);

        //////////////



        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        System.out.println(response1.getBody().getAccess_token());
        headers.setBearerAuth(response1.getBody().getAccess_token());

        HttpEntity<ApparetmentInfo> entity = new HttpEntity<>(appInfo, headers);
        ResponseEntity<PredictionResponse> response = restTemplate.postForEntity(url,entity, PredictionResponse.class);
        Utilisateur user1 = UR.findByUsername(authentication.getName()).get();
        Prediction p = new Prediction();
        p.setUtilisateur(user1);
        p.setApparetmentInfo(AppartementInfoMapper.convertToEntity(appInfo));
        assert response.getBody() != null;
        p.setPrixPrevu(response.getBody().getPrediction());
        PR.save(p);
        return response.getBody();
    }
}
