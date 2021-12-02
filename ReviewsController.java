package com.example.reviews;
//import java.util.*;

//import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ReviewsController {

    @Autowired
    private ReviewsRepository repo;

    @GetMapping("/newreview")
    public String newReview(Model model)
    {
        model.addAttribute("Reviews", new Reviews());
        return "newreview";
    }

    @PostMapping("/newreview")
    public String submitReview(@ModelAttribute Reviews rev, Model model)
    {
        model.addAttribute("Reviews", rev);
        repo.save(rev);
        return "reviewsubmitted";
    }

    @GetMapping("/allreviews")
    public String getAllReviews(Model model)
    {
        model.addAttribute("Reviews", repo.findAll());
        return "allreviews";
    }

    @GetMapping("/allusers")
    public String getAllUser(Model model)
    {
        model.addAttribute("Reviews", repo.getUserReviews("adf"));
        return "alluserreviews";
    }

}
