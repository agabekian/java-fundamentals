package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public Restaurant(String name, String pricing) {
        this.name = name;
        this.pricing = pricing;
    }

    public String name;
    public String pricing;
    List<Review> reviews = new ArrayList<>();
    private int avgRating;
    private void calcAvgRating (){
        int totalRating = 0;
        for(Review r :reviews){
            totalRating += r.rating;
            System.out.println("rating is"+totalRating);
        }
        avgRating = totalRating/reviews.size();
    }
    public int getRating(){
        calcAvgRating();
        return avgRating;
    }
    public void addReview (Review newReview){
        reviews.add(newReview);
    }
}
