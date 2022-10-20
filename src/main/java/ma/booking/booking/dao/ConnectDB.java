package ma.booking.booking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
  private Connection con;

  public Connection getCon() {
    return con;
  }

  public static ConnectDB db;
  private final String jbdcURL = "jdbc:postgresql://db:5432/booking";
  private final String username = "postgres";
  private final String password = "secret";

  private ConnectDB() {
    try {
      Class.forName("org.postgresql.Driver");
      con = DriverManager.getConnection(jbdcURL, username, password);
      System.out.println("successful database connection");
    } catch (SQLException | ClassNotFoundException e) {
      e.printStackTrace();
      closeDb();
    }
  }

  public static ConnectDB connect() {
    if (db == null) {
      db = new ConnectDB();
    }
    return db;
  }

  private void closeDb() {
    try {
      if (con != null)
        con.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
