package at.ac.fhcampuswien.fhoverflow.api.api;

import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.AnswerService;
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
@RequestMapping("/answers")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AnswerController {
    private final AnswerService service;

    @GetMapping
    public ResponseEntity<List<Answer>> getAllAnswers() {
        return ResponseEntity.ok(service.getAllAnswers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Answer> getAnswerById(@PathVariable Long id) {
        Answer answer = service.getAnswerById(id);
        return answer == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(answer);
    }

    @PostMapping("/")
    public ResponseEntity<Answer> createAnswer(@RequestBody Answer answerInput) {
        Answer answer = service.saveAnswer(answerInput);

        return answer == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(answer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Answer> updateAnswerById(@PathVariable Long id, @RequestBody Answer answerInput) {
        answerInput.setId(id);
        Answer answer = service.saveAnswer(answerInput);

        return answer == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(answer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAnswerById(@PathVariable Long id) {
        service.deleteAnswerById(id);
        return ResponseEntity.ok().build();
    }
}
