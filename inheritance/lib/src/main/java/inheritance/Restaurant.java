package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Business {

    public Restaurant(String name, String pricing) {
        super(name, pricing);
    }

    @Override
    public String toString() {
        return "The " + name + "restaurant "+pricing+" has a rating of: "+getRating();
    }



}
