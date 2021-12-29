package at.ac.fhcampuswien.fhoverflow.api.model.post;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer extends Post {
    private Long questionId;

}
