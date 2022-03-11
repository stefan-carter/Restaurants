package co.uk.barclays;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Restaurant {
    private int id;
    private String name;
    private String imageURL;
    private ArrayList<Menu> menu;

    public static ArrayList<Restaurant> all = new ArrayList<>();

    public static void init() {
        try {
            Statement createTable = DB.conn.createStatement();
            createTable.execute(
                    "CREATE TABLE IF NOT EXISTS restaurants (id INTEGER PRIMARY KEY, name TEXT, imageURL TEXT);");
            Statement getRestaurants = DB.conn.createStatement();
            ResultSet restaurants = getRestaurants.executeQuery("SELECT * FROM restaurants;");
            while (restaurants.next()) {
                int id = restaurants.getInt(1);
                String name = restaurants.getString(2);
                String imageURL = restaurants.getString(3);
                new Restaurant(id, name, imageURL);
                // Query menu table and get all menus for the restaurant
                // While loop over the results set (22)- create new menu and add to this.menus
            }
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }
    }

    public Restaurant(String name, String imageURL) {
        this.name = name;
        this.imageURL = imageURL;
        this.menu = new ArrayList<Menu>();
        try {
            PreparedStatement insertRestaurant = DB.conn
                    .prepareStatement("INSERT INTO restaurants (name, imageURL) values (?, ?);");
            insertRestaurant.setString(1, this.name);
            insertRestaurant.setString(2, this.imageURL);
            // insertRestaurant.setString(3, this.menu);

            insertRestaurant.executeUpdate();
            this.id = insertRestaurant.getGeneratedKeys().getInt(1);
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

        Restaurant.all.add(this);
    }

    public Restaurant(int id, String name, String imageURL) {
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;
        Restaurant.all.add(this);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Menu> getMenu() {
        return this.menu;
    }

}
