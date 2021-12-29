package at.ac.fhcampuswien.fhoverflow.api.model.post;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Question extends Post {
    private List<Answer> answers = new ArrayList<>();
}
