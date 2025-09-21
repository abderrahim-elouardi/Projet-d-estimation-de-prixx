package predictionAppBackend.dtos;

import lombok.Data;

@Data
public class AuthenticationPredictionSystem {
    private String access_token;
    private String token_type;
}
