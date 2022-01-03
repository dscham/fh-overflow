package at.ac.fhcampuswien.fhoverflow.api.model.post;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public abstract class Post {
    @Id
    @GeneratedValue
    protected Long id;
    protected EPostType type;
    protected Long ownerId;
    protected String content;
    protected String title;
    //protected List<LikeDislike> likesDislikes;
}
