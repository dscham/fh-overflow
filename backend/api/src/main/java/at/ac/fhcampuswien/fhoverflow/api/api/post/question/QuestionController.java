package at.ac.fhcampuswien.fhoverflow.api.api.post.question;

import at.ac.fhcampuswien.fhoverflow.api.api.IApiMapper;
import at.ac.fhcampuswien.fhoverflow.api.model.post.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuestionController {
    private final IApiMapper mapper;
    private final QuestionService service;

    @GetMapping
    public ResponseEntity<List<QuestionDTO>> getAllAnswers() {
        return ResponseEntity.noContent().build();
    }
}
