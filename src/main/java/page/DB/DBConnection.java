package page.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName( "org.postgresql.Driver" );
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/EmployeeSearch",
                        "postgres",
                        "admin" );
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }

    if(connection == null){
        System.out.println( "Connected to DB" );
    }
    return connection;
    }
}
