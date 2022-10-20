package ma.booking.booking.dao;

import ma.booking.booking.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao implements Dao<User> {
  private static Connection con = ConnectDB.connect().getCon();

  @Override
  public User getById(int id) {
    try {
      PreparedStatement preparedStatement = con.prepareStatement("select * from users where id = ?");
      preparedStatement.setInt(1, id);

      ResultSet rs = preparedStatement.executeQuery();
      if (rs.next())
        return new User(rs.getString("name"), rs.getString("email"), rs.getString("psswd"), rs.getInt("id"));
      return null;
    } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
    }
  }

  public static User getFirst() {
    try {
      PreparedStatement preparedStatement = con
          .prepareStatement("select * from users");
      ResultSet rs = preparedStatement.executeQuery();
      if (rs.next())
        return new User(rs.getString("name"), rs.getString("email"), rs.getString("psswd"), rs.getInt("id"));
      return null;
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

  // login function here
  public static User login(String email) {
    try {
      PreparedStatement preparedStatement = con.prepareStatement("select * from users where email = ? ");
      preparedStatement.setString(1, email);
      ResultSet rs = preparedStatement.executeQuery();
      if (rs.next())
        return new User(rs.getString("name"), rs.getString("email"), rs.getString("psswd"), rs.getInt("id"));
      return null;
    } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
