package ma.booking.booking.dao;

import ma.booking.booking.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao implements Dao<User> {
  ConnectDB conn = ConnectDB.connect();
  static Connection con = ConnectDB.con;

  @Override
  public User getById(int id) {
    try {
      PreparedStatement preparedStatement = con.prepareStatement("select * from users where id = ?");
      preparedStatement.setInt(1, id);

      ResultSet rs = preparedStatement.executeQuery();
      rs.next();
      return new User(rs.getString("name"), rs.getString("email"), rs.getInt("id"));
    } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
    }

  }

  public static User getFirst() {
    try {
      PreparedStatement preparedStatement = con
          .prepareStatement("select 'imad' as name, 'imad@email.com' as email, 1 as id");
      ResultSet rs = preparedStatement.executeQuery();
      rs.next();
      return new User(rs.getString("name"), rs.getString("email"), rs.getInt("id"));
    } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
    }
  }

  @Override
  public ArrayList<User> getAll() {
    return null;
  }

  @Override
  public void saveItem(User users) {

  }

  @Override
  public void updateItem(User users, String[] params) {

  }

  @Override
  public void delete(User users) {

  }
}
