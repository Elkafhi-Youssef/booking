package ma.booking.booking.controller;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import ma.booking.booking.dao.ConnectDB;
import ma.booking.booking.model.User;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {


  public void init() {
    ConnectDB conn = ConnectDB.connect();
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");

    // Hello
    PrintWriter out = response.getWriter();
    out.println("<html><body>");

    out.println("</body></html>");
  }

  public void destroy() {
  }
}
