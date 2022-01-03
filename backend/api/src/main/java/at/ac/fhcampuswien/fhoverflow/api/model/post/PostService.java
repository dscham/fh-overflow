package at.ac.fhcampuswien.fhoverflow.api.model.post;

import at.ac.fhcampuswien.fhoverflow.api.repository.IPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PostService {
    private final IPostRepository repository;

    public List<Post> getPostsByUserId(Long userId) {
        return repository.getAllByOwnerId(userId);
    }

    public List<Post> getPostsByUserIdAndPostType(Long id, EPostType postType) {
        return repository.getAllByOwnerIdAndType(id, postType);
    }
}
