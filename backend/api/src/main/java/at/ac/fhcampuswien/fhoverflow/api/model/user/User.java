package at.ac.fhcampuswien.fhoverflow.api.model.user;

import at.ac.fhcampuswien.fhoverflow.api.model.LikeDislike;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String nick;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    @OneToMany(mappedBy = "ownerId")
    private List<Post> posts;
    //private List<LikeDislike> likeDislikes;
}
