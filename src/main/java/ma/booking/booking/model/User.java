package ma.booking.booking.model;

import ma.booking.booking.dao.UserDao;

import java.util.ArrayList;

public class User {
  private String fullName;
  private String email;
  private int id;
  private String psswd;

  public String getPsswd() {
    return psswd;
  }

  public void setPsswd(String psswd) {
    this.psswd = psswd;
  }

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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public static User getById(int id) {
    UserDao userDao = new UserDao();
    return userDao.getById(id);
  }

  @Override
  public String toString() {
    return "User{" +
            "fullName='" + this.getFullName() + '\'' +
            ", email='" + this.getEmail() + '\'' +
            ", id=" + this.getId() +
            '}';
  }

  public static User getFirst() {
    return UserDao.getFirst();
  }
}
