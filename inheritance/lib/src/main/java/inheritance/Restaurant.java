package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public String pricing;
    List<Review> reviews = new ArrayList<>();
    public Restaurant(String name, String pricing) {
        this.name = name;
        this.pricing = pricing;
    }
    public int calcAvgRating (){
        int totalRating = 0;
        for(Review r :reviews){
            totalRating += r.rating;
        }
        return totalRating/reviews.size();
    }
    public void addReview (Review newReview) {
        if (!reviews.contains(newReview)) {
            reviews.add(newReview);
        } else {
            System.out.println("review already added");
        }
    }
    @Override
    public String toString(){
        return "The "+name+ " restaurant has a rating of "+calcAvgRating()+" price range: "+ pricing;
    }
}
