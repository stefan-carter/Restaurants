import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Menu> menu;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<Menu>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

}
