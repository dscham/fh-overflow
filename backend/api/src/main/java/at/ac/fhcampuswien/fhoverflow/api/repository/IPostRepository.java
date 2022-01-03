package at.ac.fhcampuswien.fhoverflow.api.repository;

import at.ac.fhcampuswien.fhoverflow.api.model.post.EPostType;
import at.ac.fhcampuswien.fhoverflow.api.model.post.Post;
import at.ac.fhcampuswien.fhoverflow.api.model.post.answer.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPostRepository extends JpaRepository<Post, Long> {
    List<Post> getAllByOwnerId(Long ownerId);

    List<Post> getAllByOwnerIdAndType(Long id, EPostType postType);
}
