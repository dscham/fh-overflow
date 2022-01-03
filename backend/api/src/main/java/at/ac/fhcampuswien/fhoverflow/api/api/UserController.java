package at.ac.fhcampuswien.fhoverflow.api.api;

import at.ac.fhcampuswien.fhoverflow.api.model.post.EPostType;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import at.ac.fhcampuswien.fhoverflow.api.model.post.PostService;
import at.ac.fhcampuswien.fhoverflow.api.model.user.User;
import at.ac.fhcampuswien.fhoverflow.api.model.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService service;
    private final PostService postService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = service.getUserById(id);
        return user == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(user);
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User userInput) {
        User user = service.saveUser(userInput);

        return user == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User userInput) {
        userInput.setId(id);
        User user = service.saveUser(userInput);

        return user == null ? ResponseEntity.noContent().build() : ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUserById(@PathVariable Long id) {
        service.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/validate-email")
    public ResponseEntity<ValidationResponse> deleteUserById(@PathParam("email") String email) {
        return ResponseEntity.ok(new ValidationResponse(service.validateEmail(email)));
    }

    @GetMapping("/{id}/posts")
    public ResponseEntity<List<Post>> getAllPostsByUserId(@PathVariable Long id, @PathParam("postType") EPostType postType) {
        if(postType != null) {
            return ResponseEntity.ok(postService.getPostsByUserIdAndPostType(id, postType));
        }
        return ResponseEntity.ok(postService.getPostsByUserId(id));
    }
}
