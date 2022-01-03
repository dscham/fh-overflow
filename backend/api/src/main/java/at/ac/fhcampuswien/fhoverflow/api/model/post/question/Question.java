package at.ac.fhcampuswien.fhoverflow.api.model.post.question;

import at.ac.fhcampuswien.fhoverflow.api.model.post.EPostType;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Question extends Post {
    private EPostType type = EPostType.QUESTION;
    @OneToMany(mappedBy = "questionId")
    private List<Answer> answers = new ArrayList<>();
}
