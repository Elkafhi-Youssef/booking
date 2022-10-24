package ma.booking.booking.controller;

import java.io.*;

import jakarta.servlet.http.*;
import ma.booking.booking.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class Login extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    HttpSession session = req.getSession();
    if (session.getAttribute("id") != null)
      res.sendRedirect("home");
    else
      req.getRequestDispatcher("login.jsp").forward(req, res);
  }

  @Override
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    User user = User.login(req.getParameter("email"));
    HttpSession session = req.getSession();
    if (user != null && user.getPsswd().equals(req.getParameter("psswd"))) {
      session.setAttribute("id", user.getId());
      session.setAttribute("name", user.getFullName());
      session.setAttribute("email", user.getEmail());
      res.sendRedirect("home");
    } else {
      req.setAttribute("message", "wrong email or password!");
      req.getRequestDispatcher("login.jsp").forward(req, res);
    }
  }

}
