package ma.booking.booking.model;

import ma.booking.booking.dao.UserDao;

import java.util.ArrayList;

public class User {
  private String fullName;
  private String email;
  private int id;

  public static ArrayList<User> users;

  public User() {
  };

  public User(String fullName, String email, int id) {
    this.fullName = fullName;
    this.email = email;
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public static User getById(int id) {
    UserDao userDao = new UserDao();
    return userDao.getById(id);
  }

  public static User getFirst() {
    return UserDao.getFirst();
  }
}
