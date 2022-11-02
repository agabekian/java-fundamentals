package inheritance;

import java.util.ArrayList;
import java.util.List;

abstract public class Business implements CustomerRelations {
    String name;
    String pricing;


    List<Review> reviews = new ArrayList<>();
    List<String> inventory = new ArrayList<>();

    public Business(String name, String pricing) {
        this.name = name;
        this.pricing = pricing;
    }

    public Business(String name) {
        this.name = name;
    }

    private int avgRating() {
        int totalRating = 0;
        for (Review review : reviews) {
            totalRating += review.rating;
        }
        if (reviews.size() > 0) {
            return totalRating / reviews.size();
        } else {
            return 0;

        }
    }

    public String getRating() {
        if (avgRating() == 0) {
            return "unrated";
        }
        return String.valueOf(avgRating());
    }
    public void addReview(Review newReview) {
        if (!reviews.contains(newReview)) {
            reviews.add(newReview);
        } else {
            System.out.println("review already added");
        }
    }
    public void dealWithPissedOfCustomers() {
        System.out.println("sorry we are closed now");
    }
}
