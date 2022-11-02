package inheritance;

public class Theatre extends Business {

    public Theatre(String name) {
        super(name);
    }

    public void addMovie(String film) {
        inventory.add(film);
        System.out.println(inventory);
    }

    public void removeMovie(String film) {
        if(inventory.contains(film)){
            inventory.remove(inventory.indexOf(film));
        }
        System.out.println(inventory);
    }

    @Override
    public String toString() {
        String show = "The theatre " + name + "" +
                " is showing the following: ";
        StringBuilder movies = new StringBuilder();
        for (String mov : inventory) {
            movies.append(mov);
            if (mov == inventory.get(inventory.size()-1)) {
                mov += (".");
            } else {
                movies.append(",");
            }
        }
        movies.append(".");
        return show + movies;
    }
}
