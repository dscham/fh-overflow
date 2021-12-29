package at.ac.fhcampuswien.fhoverflow.api.entities.post.question;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionRepository extends JpaRepository<QuestionEntity, Long> {

}
