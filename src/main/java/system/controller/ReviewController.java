package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.exception.ReviewNotFoundException;
import system.model.Review;
import system.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;


    @GetMapping
    public List<Review> getAllReviews() {
        try {
            return reviewService.getAllReviews();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve Reviews", e);
        }
    }

    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id)  {
        return reviewService.findById(id).orElseThrow(() -> new ReviewNotFoundException("Review not found with ID: " + id));
    }

}
