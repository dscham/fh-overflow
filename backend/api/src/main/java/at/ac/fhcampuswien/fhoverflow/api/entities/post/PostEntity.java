package at.ac.fhcampuswien.fhoverflow.api.entities.post;

import at.ac.fhcampuswien.fhoverflow.api.entities.LikeDislikeEntity;
import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public abstract class PostEntity {
    @Id
    @GeneratedValue
    protected Long id;
    protected Long ownerId;
    protected String content;
    protected String title;
//    @ManyToMany(mappedBy = "postId")
//    protected List<LikeDislikeEntity> likesDislikes;
}
