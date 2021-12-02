package com.example.reviews;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Reviews")
public class Reviews {

    @Id
    String user;
    String restaurant;
    int rating;
    String comment;

    public Reviews()
    {

    }

    public Reviews(String u, String r, int ra, String c)
    {
        user = u;
        restaurant = r;
        rating = ra;
        comment = c;
    }

    public String getUser()
    {
        return user;
    }

    public String getRestaurant()
    {
        return restaurant;
    }

    public int getRating()
    {
        return rating;
    }

    public String getComment()
    {
        return comment;
    }

    public void setUser(String u)
    {
        user = u;
    }

    public void setRestaurant(String r)
    {
        restaurant = r;
    }

    public void setRating(int r)
    {
        rating = r;
    }

    public void setComment(String c)
    {
        comment = c;
    }

    @Override
    public String toString()
    {
        return "Username: " + user + " Restaurant: " + restaurant + " Rating: " + rating + " Comments: " + comment;
    }
    
}
