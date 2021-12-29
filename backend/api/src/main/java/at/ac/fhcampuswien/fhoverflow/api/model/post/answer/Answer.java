package at.ac.fhcampuswien.fhoverflow.api.model.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer extends Post {
    private Long questionId;

}
