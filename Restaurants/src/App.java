public class App {
    public static void main(String[] args) throws Exception {
        // Create DB connection
        new DB("jdbc:sqlite:./database.sqlite");
        // Initialise class
        Restaurant.init();

        // Create restaurant
        Restaurant restaurant = new Restaurant("Stefano's Pizza", "https://Stefanos.jpeg");
        // Create menu
        Menu starters = new Menu("Starters");
        Menu mains = new Menu("Mains");
        Menu desserts = new Menu("Desserts");
        // Add menu to restaurant
        restaurant.getMenu().add(starters);
        restaurant.getMenu().add(mains);
        restaurant.getMenu().add(desserts);
        // Create items
        Item pizza1 = new Item("Farmhouse", 7.99);
        Item pizza2 = new Item("Pepperoni", 7.99);
        // Add items to menu
        mains.getItem().add(pizza1);
        mains.getItem().add(pizza2);

        // Create second resaurant
        Restaurant restaurant2 = new Restaurant("Emilie's Cakes and Shakes", "https://EmiliesC&S.jpeg");
        // Create menu
        Menu sharers = new Menu("Sharers");
        Menu cakes = new Menu("Cakes");
        Menu shakes = new Menu("Shakes");
        // Add menu to restaurant
        restaurant2.getMenu().add(sharers);
        restaurant2.getMenu().add(cakes);
        restaurant2.getMenu().add(shakes);
        // Create items
        Item shake1 = new Item("Snickers Shake", 3.99);
        Item shake2 = new Item("Strawberry Shake", 2.99);
        // Add items to menu
        shakes.getItem().add(shake1);
        shakes.getItem().add(shake2);

        DB.conn.close();
    }
}
