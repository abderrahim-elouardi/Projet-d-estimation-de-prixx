package predictionAppBackend.services.userService;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import predictionAppBackend.entites.MyUserDetail;
import predictionAppBackend.entites.Utilisateur;
import predictionAppBackend.repositorys.UtilisateurRepository;

import java.util.Optional;


@Service
public class MyUserDetailsService implements UserDetailsService {

    private UtilisateurRepository UR;

    public MyUserDetailsService(UtilisateurRepository UR) {
        this.UR = UR;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Utilisateur> user=UR.findByUsername(username);
        if(user.isPresent()){
            return new MyUserDetail(
                    user.get().getUsername(),
                    user.get().getPassword(),
                    user.get().getRole()
            );
        }
        else{
            throw  new UsernameNotFoundException("l'utilisateur n'est pas exist");
        }
    }
}
