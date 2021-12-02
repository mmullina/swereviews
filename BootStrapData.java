package com.example.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final ReviewsRepository repo;

    public BootStrapData(ReviewsRepository r)
    {
        repo = r;
    }

    @Override
    public void run(String... args) throws Exception{
        repo.deleteAll();
        /*Reviews rev = new Reviews("adf", "344", 4, "gfgf");
        Reviews rev1 = new Reviews("45", "ffg", 5, "hhhhh");
        Reviews rev2 = new Reviews("adf", "ffg", 5, "hhhhh");
        Reviews rev3 = new Reviews("adf", "ffg", 5, "hhhhh");
        Reviews rev4 = new Reviews("456", "ffg", 5, "hhhhh");
        Reviews rev5 = new Reviews("457", "ffg", 5, "hhhhh");
        Reviews rev6 = new Reviews("458", "ffg", 5, "hhhhh");
        Reviews rev7 = new Reviews("459", "ffg", 5, "hhhhh");

        repo.save(rev);
        repo.save(rev1);
        repo.save(rev2);
        repo.save(rev3);
        repo.save(rev4);
        repo.save(rev5);
        repo.save(rev6);
        repo.save(rev7);
        //System.out.println("This shit hittin");
        System.out.println("Number of reviews: " + repo.count());
        //repo.deleteAll();*/
    }
    
}
