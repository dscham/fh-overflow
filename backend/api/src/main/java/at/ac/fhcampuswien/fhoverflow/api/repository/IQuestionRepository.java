package at.ac.fhcampuswien.fhoverflow.api.repository;

import at.ac.fhcampuswien.fhoverflow.api.model.post.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<Question, Long> {

}
