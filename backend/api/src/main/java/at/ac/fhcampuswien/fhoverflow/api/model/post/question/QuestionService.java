package at.ac.fhcampuswien.fhoverflow.api.model.post.question;

import at.ac.fhcampuswien.fhoverflow.api.repository.IQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuestionService {
    private final IQuestionRepository repository;

    public List<Question> getAllQuestions() {
        return repository.findAll();
    }

    public Question getQuestionById(Long id) {
        try {
            return repository.getById(id);
        } catch (EntityNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Question saveQuestion(Question question) {
        return repository.save(question);
    }

    public void deleteQuestionById(Long id) {
        repository.deleteById(id);
    }
}
