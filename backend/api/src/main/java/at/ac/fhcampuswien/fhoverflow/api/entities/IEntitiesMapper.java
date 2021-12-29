package at.ac.fhcampuswien.fhoverflow.api.entities;

import at.ac.fhcampuswien.fhoverflow.api.api.LikeDislikeDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.post.answer.AnswerDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.post.question.QuestionDTO;
import at.ac.fhcampuswien.fhoverflow.api.api.user.UserDTO;
import at.ac.fhcampuswien.fhoverflow.api.entities.post.PostEntity;
import at.ac.fhcampuswien.fhoverflow.api.entities.post.answer.AnswerEntity;
import at.ac.fhcampuswien.fhoverflow.api.entities.post.question.QuestionEntity;
import at.ac.fhcampuswien.fhoverflow.api.entities.user.UserEntity;
import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import at.ac.fhcampuswien.fhoverflow.api.model.post.question.Question;
import at.ac.fhcampuswien.fhoverflow.api.model.user.User;
import net.bytebuddy.asm.Advice;
import org.mapstruct.Mapper;

import javax.management.ObjectName;

@Mapper(componentModel = "spring")
public interface IEntitiesMapper {
    QuestionEntity convert(Question object);
    AnswerEntity convert(Answer object);
    UserEntity convert(User object);
    LikeDislikeEntity convert(LikeDislike object);
    Question convert(QuestionEntity object);
    Answer convert(AnswerEntity object);
    User convert(UserEntity object);
    LikeDislike convert(LikeDislikeEntity object);

    default Post convert(PostEntity object) {
        if(object == null)
            return null;
        if(object instanceof AnswerEntity)
            return convert((AnswerEntity) object);
        return convert((QuestionEntity) object);
    }

    default PostEntity convert(Post object) {
        if (object == null)
            return null;
        if (object instanceof Answer)
            return convert((Answer) object);
        return convert((Question) object);
    }
}
