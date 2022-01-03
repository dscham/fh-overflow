package at.ac.fhcampuswien.fhoverflow.api.model.user;

import at.ac.fhcampuswien.fhoverflow.api.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {
    private final IUserRepository repository;

    public static final String STUD_FH_CAMPUSWIEN_AC_AT = "@stud.fh-campuswien.ac.at";

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public User getUserById(Long id) {
        try {
            return repository.getById(id);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public User saveUser(User user) {
        return repository.save(user);
    }

    public void deleteUserById(Long id) {
        repository.deleteById(id);
    }

    public Boolean validateEmail(String email) {
        return email.contains(STUD_FH_CAMPUSWIEN_AC_AT);
    }
}
