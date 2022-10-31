package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public String pricing;
    List<Review> reviews = new ArrayList<>();
    private int avgRating;
    public Restaurant(String name, String pricing) {
        this.name = name;
        this.pricing = pricing;
    }
    private void calcAvgRating (){
        int totalRating = 0;
        for(Review r :reviews){
            totalRating += r.rating;
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
    @Override
    public String toString(){
        return "The "+name+ " restaurant has a rating of "+avgRating+" price range: "+ pricing;
    }
}
