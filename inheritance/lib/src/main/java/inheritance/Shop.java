package inheritance;

public class Shop extends Business{
    private String type = "shop";
    public Shop(String name, String pricing) {
        super(name,pricing);
    }
    @Override
    public String toString() {
        return "The " + name + " shop "+pricing+" has a rating of: "+getRating();
    }
}
