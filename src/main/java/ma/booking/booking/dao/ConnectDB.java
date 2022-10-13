package ma.booking.booking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
    public static Connection con = null ;

    public  static ConnectDB db;
    public static Statement stmt;
    private final String jbdcURL = "jdbc:postgresql://localhost:5432/booking";
    private final String username = "postgres";
    private final String password = "secret";

    private ConnectDB(){
        try {
            con = DriverManager.getConnection(jbdcURL,username,password);
        } catch (SQLException e) {
            System.out.println("Error in Connection With a database");
            throw new RuntimeException(e);
        }
    }
    public static  ConnectDB connect(){
        if (db ==null){
            db = new ConnectDB();
        }
        return  db;
    }
}
