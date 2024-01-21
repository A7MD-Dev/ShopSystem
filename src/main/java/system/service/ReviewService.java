package system.service;

import org.springframework.stereotype.Service;
import system.model.Review;
import system.model.repository.ReviewRepository;
import java.util.List;
import java.util.Optional;


@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createUser(Review role) {
        return reviewRepository.save(role);
    }

    public Optional<Review> findById(Long id) {
        return reviewRepository.findById(id);
    }

    public Review updateCategory(Review role) {
        return reviewRepository.save(role);
    }

    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

}
