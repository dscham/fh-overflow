package at.ac.fhcampuswien.fhoverflow.api.repository;

import at.ac.fhcampuswien.fhoverflow.api.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
