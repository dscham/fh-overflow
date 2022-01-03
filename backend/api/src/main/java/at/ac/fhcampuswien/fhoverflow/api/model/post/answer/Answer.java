package at.ac.fhcampuswien.fhoverflow.api.model.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.model.post.EPostType;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Answer extends Post {
    private EPostType type = EPostType.ANSWER;
    private Long questionId;
}
