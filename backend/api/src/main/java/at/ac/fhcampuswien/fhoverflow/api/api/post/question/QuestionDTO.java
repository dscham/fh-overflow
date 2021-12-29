package at.ac.fhcampuswien.fhoverflow.api.api.post.question;

import at.ac.fhcampuswien.fhoverflow.api.api.post.PostDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.post.answer.AnswerDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class QuestionDTO extends PostDTO {
    private List<AnswerDTO> answers = new ArrayList<>();
}
