package predictionAppBackend.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import predictionAppBackend.enums.Role;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Utilisateur {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String username;
    private String password;
    private Role role;

    @OneToMany(mappedBy = "utilisateur")
    private List<Prediction> predictionList;

}
