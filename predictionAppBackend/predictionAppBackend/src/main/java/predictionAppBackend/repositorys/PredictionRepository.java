package predictionAppBackend.repositorys;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import predictionAppBackend.entites.Prediction;
import predictionAppBackend.entites.Utilisateur;

import java.util.Optional;

public interface PredictionRepository extends JpaRepository<Prediction,Long> {
    Optional<Object> findAllByUtilisateur(Utilisateur user, PageRequest of);
}
