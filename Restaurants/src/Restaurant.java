import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Restaurant {
    private int id;
    private String name;
    private String imageURL;
    private ArrayList<Menu> menu;

    public static void init() {
        try {
            Statement createTable = DB.conn.createStatement();
            createTable.execute(
                    "CREATE TABLE IF NOT EXISTS restaurants (id INTEGER PRIMARY KEY, name TEXT, imageURL TEXT);");
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
            insertRestaurant.executeUpdate();
            this.id = insertRestaurant.getGeneratedKeys().getInt(1);
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

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
