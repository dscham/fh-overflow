package at.ac.fhcampuswien.fhoverflow.api.entities.post.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnswerRepository extends JpaRepository<AnswerEntity, Long> {
}
