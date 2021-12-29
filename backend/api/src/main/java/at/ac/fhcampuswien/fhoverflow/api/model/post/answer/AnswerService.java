package at.ac.fhcampuswien.fhoverflow.api.model.post.answer;

import at.ac.fhcampuswien.fhoverflow.api.entities.IEntitiesMapper;
import at.ac.fhcampuswien.fhoverflow.api.entities.post.answer.AnswerEntity;
import at.ac.fhcampuswien.fhoverflow.api.entities.post.answer.IAnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AnswerService {
    private final IEntitiesMapper mapper;
    private final IAnswerRepository repository;

    public List<Answer> getAllAnswers() {
        List<AnswerEntity> answerEntities = repository.findAll();
        return answerEntities.stream().map(mapper::convert).collect(Collectors.toList());
    }

    public Answer getAnswerById(Long id) {
        try {
            return mapper.convert(repository.getById(id));
        } catch (EntityNotFoundException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public Answer saveAnswer(Answer answer) {
        return mapper.convert(repository.save(mapper.convert(answer)));
    }

    public void deleteAnswerById(Long id) {
        repository.deleteById(id);
    }
}
