package predictionAppBackend.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import predictionAppBackend.dtos.PredictionResponse;
import predictionAppBackend.entites.Prediction;
import predictionAppBackend.entites.Utilisateur;
import predictionAppBackend.repositorys.PredictionRepository;
import predictionAppBackend.repositorys.UtilisateurRepository;

import java.util.List;

@Service
public class PredictionService {
    public PredictionRepository PR;
    public UtilisateurRepository UR;

    @Value("${pagesize}")
    public int size;

    public PredictionService(PredictionRepository PR, UtilisateurRepository UR) {
        this.PR = PR;
        this.UR = UR;
    }

    public List<Prediction> getMyPredictions(int page, Authentication authentication) {
        Utilisateur utilisateur = UR.findByUsername(authentication.getName()).get();
        return PR.findAllByUtilisateur(utilisateur , PageRequest.of(page,size)).map(e->(Prediction)e).stream().toList();
    }
}
