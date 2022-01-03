package at.ac.fhcampuswien.fhoverflow.api.repository;

import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnswerRepository extends JpaRepository<Answer, Long> {
}
