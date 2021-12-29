package at.ac.fhcampuswien.fhoverflow.api.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Getter
@Setter
@Entity
@IdClass(PostUserId.class)
public class LikeDislikeEntity {
    @Id
    private Long postId;
    @Id
    private Long userId;
    private Boolean dislike;
}
