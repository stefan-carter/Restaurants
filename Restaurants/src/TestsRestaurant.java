import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestsRestaurant {
    @Test
    public void a_restaurant_has_a_menu() {
        Restaurant restaurant = new Restaurant("Indian");
        Menu menu = new Menu("Starters");
        restaurant.getMenu().add(menu);
        assertEquals(restaurant.getMenu().get(0).getTitle(), "Starters");
    }
}
