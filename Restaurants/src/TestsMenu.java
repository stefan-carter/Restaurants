import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class TestsMenu {

    @Test
    public void menu_has_items() {
        Menu menu = new Menu("Starters");
        Item item = new Item("Chicken Breast", 10.99);
        menu.getItem().add(item);
        assertEquals(menu.getItem().get(0).getDish(), "Chicken Breast");

    }

    @Test
    public void restaurant_has_menu_and_menu_has_items() {
        Restaurant restaurant = new Restaurant("Indian", "imageURL");
        restaurant.getMenu().add(new Menu("Drinks"));
    }

}
