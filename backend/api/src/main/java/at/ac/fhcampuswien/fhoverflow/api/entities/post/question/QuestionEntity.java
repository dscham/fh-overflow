package at.ac.fhcampuswien.fhoverflow.api.entities.post.question;

import at.ac.fhcampuswien.fhoverflow.api.entities.post.PostEntity;
import at.ac.fhcampuswien.fhoverflow.api.entities.post.answer.AnswerEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class QuestionEntity extends PostEntity {
    @OneToMany(mappedBy = "questionId")
    private List<AnswerEntity> answers = new ArrayList<>();
}
