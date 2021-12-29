package at.ac.fhcampuswien.fhoverflow.api.api.post;

import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class PostDTO {
    protected Long id;
    protected Long ownerId;
    protected String content;
    protected String title;
    protected List<LikeDislike> likesDislikes;
}
