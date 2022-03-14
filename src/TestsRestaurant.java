import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestsRestaurant {
    @Before
    public void setup() {
        new DB("jdbc:sqlite::memory:");
        // Menu.init();
        Restaurant.init();
    }

    @Test
    public void a_restaurant_has_a_menu() {
        Restaurant restaurant = new Restaurant("Indian", "imageURL");
        Menu menu = new Menu("Starters");
        restaurant.getMenu().add(menu);
        assertEquals(restaurant.getMenu().get(0).getTitle(), "Starters");
    }
}
