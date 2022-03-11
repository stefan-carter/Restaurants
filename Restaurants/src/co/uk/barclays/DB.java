package co.uk.barclays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection conn;

    public DB(String connectionString) {
        try {
            DB.conn = DriverManager.getConnection(connectionString);
        } catch (SQLException error) {
            System.out.println(error.getMessage());

        }
    }
}

// Connection
// Driver Manager
// SQL Exception

// Statement
// PreparedStatement
// ResultSet
