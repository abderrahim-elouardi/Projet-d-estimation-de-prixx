package predictionAppBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import predictionAppBackend.entites.Utilisateur;
import predictionAppBackend.enums.Role;
import predictionAppBackend.repositorys.UtilisateurRepository;

@SpringBootApplication
public class PredictionAppBackendApplication implements CommandLineRunner {

	@Autowired
	UtilisateurRepository UR;
	@Autowired
	PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(PredictionAppBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Utilisateur user =new Utilisateur();
		user.setRole(Role.USER);
		user.setPassword(passwordEncoder.encode("abdo"));
		user.setUsername("abdo");
		UR.save(user);
	}

}
