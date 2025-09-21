package predictionAppBackend.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import predictionAppBackend.dtos.ApparetmentInfo;
import predictionAppBackend.dtos.PredictionResponse;
import predictionAppBackend.entites.Prediction;
import predictionAppBackend.services.PredireService;

import java.util.Map;

@RestController
public class predireController {
    public PredireService predictionService;

    public predireController(PredireService predictionService) {
        this.predictionService = predictionService;
    }

    @PostMapping(path = "/getPrediction")
    public PredictionResponse getPrediction(@RequestBody ApparetmentInfo appInfo, Authentication authentication){
        return predictionService.getPredection(appInfo,authentication);
    }


}
