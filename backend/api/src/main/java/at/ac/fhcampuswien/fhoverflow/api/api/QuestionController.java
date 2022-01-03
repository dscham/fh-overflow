package at.ac.fhcampuswien.fhoverflow.api.api;

import at.ac.fhcampuswien.fhoverflow.api.model.post.question.Question;
import at.ac.fhcampuswien.fhoverflow.api.model.post.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questions")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuestionController {
    private final QuestionService service;

    @GetMapping
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(service.getAllQuestions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        Question question = service.getQuestionById(id);
        return question == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(question);
    }

    @PostMapping("/")
    public ResponseEntity<Question> createQuestion(@RequestBody Question questionInput) {
        Question question = service.saveQuestion(questionInput);

        return question == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(question);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Question> updateQuestionById(@PathVariable Long id, @RequestBody Question questionInput) {
        questionInput.setId(id);
        Question question = service.saveQuestion(questionInput);

        return question == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(question);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteQuestionById(@PathVariable Long id) {
        service.deleteQuestionById(id);
        return ResponseEntity.ok().build();
    }
}
