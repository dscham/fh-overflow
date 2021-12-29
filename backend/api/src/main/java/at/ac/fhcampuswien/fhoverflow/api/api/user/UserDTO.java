package at.ac.fhcampuswien.fhoverflow.api.api.user;

import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String nick;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private List<Post> posts;
    private List<LikeDislike> likeDislikes;
}
