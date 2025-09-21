package predictionAppBackend.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import predictionAppBackend.entites.Prediction;
import predictionAppBackend.services.PredictionService;

import java.util.List;

@RestController
public class predictionController {
    public PredictionService PS;

    public predictionController(PredictionService PS) {
        this.PS = PS;
    }

    @GetMapping("/getpredictions")
    public List<Prediction> getMyPredictions(int page , Authentication authentication){
        return PS.getMyPredictions(page,authentication);
    }

}
