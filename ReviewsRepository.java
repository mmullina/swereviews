package com.example.reviews;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface ReviewsRepository extends MongoRepository<Reviews, String> {

    @Query("{user : ?0}")
    List<Reviews> getUserReviews(String user);

    @Query("{restaurant : ?0}")
    List<Reviews> getRestaurantReviews(String restaurant);
}
