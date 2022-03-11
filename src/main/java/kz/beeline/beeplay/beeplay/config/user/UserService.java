package kz.beeline.beeplay.beeplay.config.user;

import javax.transaction.Transactional;

import kz.beeline.beeplay.beeplay.config.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repo;

    public void updateAuthenticationType(String username, String oauth2ClientName) {
        AuthenticationType authType = AuthenticationType.valueOf(oauth2ClientName.toUpperCase());
        repo.updateAuthenticationType(username, authType);
        System.out.println("Updated user's authentication type to " + authType);
    }

    public void saveNewUser(User user,String authType){
        user.setAuthType(AuthenticationType.valueOf(authType));
        repo.save(user);
    }

    public boolean existsByUsername(String username) {
        return repo.existsByUsername(username);
    }

}
