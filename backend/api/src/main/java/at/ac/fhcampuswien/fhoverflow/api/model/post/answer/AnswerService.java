package at.ac.fhcampuswien.fhoverflow.api.model.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.repository.IAnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AnswerService {
    private final IAnswerRepository repository;

    public List<Answer> getAllAnswers() {
        return repository.findAll();
    }

    public Answer getAnswerById(Long id) {
        try {
            return repository.getById(id);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Answer saveAnswer(Answer answer) {
        return repository.save(answer);
    }

    public void deleteAnswerById(Long id) {
        repository.deleteById(id);
    }
}
