package at.ac.fhcampuswien.fhoverflow.api.api.user;

import at.ac.fhcampuswien.fhoverflow.api.api.IApiMapper;
import at.ac.fhcampuswien.fhoverflow.api.model.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final IApiMapper mapper;
    private final UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.noContent().build();
    }
}
