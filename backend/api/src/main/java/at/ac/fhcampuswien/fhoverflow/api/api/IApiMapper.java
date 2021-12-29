package at.ac.fhcampuswien.fhoverflow.api.api;

import at.ac.fhcampuswien.fhoverflow.api.api.post.PostDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.post.answer.AnswerDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.post.question.QuestionDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.user.UserDTO;
import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import at.ac.fhcampuswien.fhoverflow.api.model.post.question.Question;
import at.ac.fhcampuswien.fhoverflow.api.model.user.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IApiMapper {
    QuestionDTO convert(Question object);

    AnswerDTO convert(Answer object);

    UserDTO convert(User object);

    LikeDislikeDTO convert(LikeDislike object);

    Question convert(QuestionDTO object);

    Answer convert(AnswerDTO object);

    User convert(UserDTO object);

    LikeDislike convert(LikeDislikeDTO object);

    default Post convert(PostDTO object) {
        if (object == null)
            return null;
        if (object instanceof AnswerDTO)
            return convert((AnswerDTO) object);
        return convert((QuestionDTO) object);
    }

    default PostDTO convert(Post object) {
        if (object == null)
            return null;
        if (object instanceof Answer)
            return convert((Answer) object);
        return convert((Question) object);
    }
}
