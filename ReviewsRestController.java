package com.example.reviews;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewsRestController {

    @Autowired
    private ReviewsRepository repo;

    @RequestMapping("/reviews")
    public List<Reviews> displayReviews()
    {
        return repo.findAll();
    }

    @RequestMapping("/{user}/reviews")
    public List<Reviews> displayUserReviews(@PathVariable String user)
    {
        return repo.getUserReviews(user);
    }

    @RequestMapping("/reviews/{restaurant}")
    public List<Reviews> displayRestaurantReviews(@PathVariable String restaurant)
    {
        return repo.getRestaurantReviews(restaurant);
    }
    
}
