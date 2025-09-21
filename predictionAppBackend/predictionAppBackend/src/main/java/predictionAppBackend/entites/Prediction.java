package predictionAppBackend.entites;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import predictionAppBackend.dtos.ApparetmentInfo;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private ApparetmentInfoEntite apparetmentInfo;

    private double prixPrevu;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Utilisateur utilisateur;



}
