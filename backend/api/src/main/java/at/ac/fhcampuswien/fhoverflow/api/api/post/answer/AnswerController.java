package at.ac.fhcampuswien.fhoverflow.api.api.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.api.IApiMapper;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.cci.object.MappingRecordOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/answers")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AnswerController {
    private final IApiMapper mapper;
    private final AnswerService service;

    @GetMapping
    public ResponseEntity<List<AnswerDTO>> getAllAnswers() {
        List<AnswerDTO> answers = service.getAllAnswers().stream().map(mapper::convert).collect(Collectors.toList());
        return ResponseEntity.ok(answers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnswerDTO> getAnswerById(@PathVariable Long id) {
        AnswerDTO answer = mapper.convert(service.getAnswerById(id));

        return answer == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(answer);
    }

    @PostMapping("/")
    public ResponseEntity<AnswerDTO> createAnswer(@RequestBody AnswerDTO answerDTO) {
        AnswerDTO answer = mapper.convert(service.saveAnswer(mapper.convert(answerDTO)));

        return answer == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(answer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnswerDTO> updateAnswerById(@PathVariable Long id, @RequestBody AnswerDTO answerDTO) {
        answerDTO.setId(id);
        AnswerDTO answer = mapper.convert(service.saveAnswer(mapper.convert(answerDTO)));

        return answer == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(answer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAnswerById(@PathVariable Long id) {
        service.deleteAnswerById(id);
        return ResponseEntity.ok().build();
    }
}
