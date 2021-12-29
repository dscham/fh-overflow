package at.ac.fhcampuswien.fhoverflow.api.model.user;

import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User {
    private Long id;
    private String nick;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private List<Post> posts;
    private List<LikeDislike> likeDislikes;
}
