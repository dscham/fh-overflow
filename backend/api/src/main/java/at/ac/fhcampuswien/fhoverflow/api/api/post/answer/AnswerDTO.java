package at.ac.fhcampuswien.fhoverflow.api.api.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.api.post.PostDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDTO extends PostDTO {
    private Long questionId;

}
