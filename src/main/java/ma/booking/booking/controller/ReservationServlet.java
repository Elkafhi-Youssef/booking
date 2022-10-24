package ma.booking.booking.controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.booking.booking.dao.ConnectDB;
import ma.booking.booking.dao.ReservationDao;
import ma.booking.booking.model.Reservation;
import ma.booking.booking.model.ReservationRow;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(name = "reservationServlet", value = "/reservation-servlet")
@WebServlet("/reservationServlet")
public class ReservationServlet extends HttpServlet {
    private ReservationDao rd;
    public List<ReservationRow> listReservations;


    public void init() {
        ConnectDB conn = ConnectDB.connect();
        Connection con = ConnectDB.con;
         rd = new ReservationDao(con);

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       listReservations = rd.getAllReservation();
        System.out.println("list of res ");
        for(ReservationRow r : listReservations) {
            System.out.println(r.getId());
        }

        request.setAttribute("listReservations", listReservations);
        request.getRequestDispatcher("admin/reservation.jsp").forward(request,response);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("");
//        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }




}
