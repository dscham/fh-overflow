package at.ac.fhcampuswien.fhoverflow.api.entities.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.entities.post.PostEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class AnswerEntity extends PostEntity {
    private Long questionId;

}
