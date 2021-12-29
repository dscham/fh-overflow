package at.ac.fhcampuswien.fhoverflow.api.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PostUserId implements Serializable {
    private Long postId;
    private Long userId;
}
