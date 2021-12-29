package at.ac.fhcampuswien.fhoverflow.api.entities.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {

}
