package ma.booking.booking.controller;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

@WebServlet(name = "reservation", value = "/reservation")
public class Reservation extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    req.getRequestDispatcher("reservationPage.jsp").forward(req, res);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    RequestDispatcher requestDispatcher = req.getRequestDispatcher("imad.jsp");
    requestDispatcher.forward(req, res);
  }
}
