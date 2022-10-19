package ma.booking.booking.controller;

import java.io.*;

import jakarta.servlet.http.*;
import ma.booking.booking.dao.ConnectDB;
import ma.booking.booking.model.User;
import jakarta.servlet.annotation.*;

@WebServlet(name = "loginc", value = "/loginc")
public class Login extends HttpServlet {
  private ConnectDB con;

  public void init() {
    con = ConnectDB.connect();
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String email = request.getParameter("email");
    User user = User.login(email);
    if (user != null)
      response.sendRedirect("");
    else
      response.sendRedirect("login");
  }

  public void destroy() {
  }
}
