package predictionAppBackend.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import predictionAppBackend.enums.Role;

import java.util.Collection;
import java.util.List;

@AllArgsConstructor
@Data
public class MyUserDetail implements UserDetails {

    private String username;
    private String password;
    private Role role;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.role!=null)
            return List.of(new SimpleGrantedAuthority(this.role.toString()));
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}