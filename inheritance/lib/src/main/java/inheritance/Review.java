package inheritance;

public class Review {
    public int rating;
    public String body;
    public String author;

    private int checkRating (int rated) {
        if (rated < 1 || rated > 5) {
            System.out.println("Please rate between 1 and 5 stars");
        }
        return rated;
    }


    public Review(String body, String author, int rating) {
        this.body = body;
        this.author = author;
        this.rating = checkRating(rating);
    }
}
