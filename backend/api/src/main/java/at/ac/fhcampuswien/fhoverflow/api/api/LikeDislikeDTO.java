package at.ac.fhcampuswien.fhoverflow.api.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeDislikeDTO {
    private Long postId;
    private Long userId;
    private Boolean dislike;
}
