package at.ac.fhcampuswien.fhoverflow.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeDislike {
    private Long postId;
    private Long userId;
    private Boolean dislike;
}
