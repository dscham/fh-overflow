package at.ac.fhcampuswien.fhoverflow.api.model.post.question;

import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Question extends Post {
    private List<Answer> answers = new ArrayList<>();
}
