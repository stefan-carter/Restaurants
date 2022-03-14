import java.util.ArrayList;

public class Menu {
    private String title;
    private ArrayList<Item> items;

    public Menu(String title) {
        this.title = title;
        this.items = new ArrayList<Item>();
        // Create this menu in the database
        // Create this menu with restaurant ID - title / restaurant ID
    }

    // Make another constructor for menu which includes the ID - but doesn't write
    // to DB

    public String getTitle() {
        return this.title;
    }

    public ArrayList<Item> getItem() {
        return this.items;
    }

}
