package ma.booking.booking.controller;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.booking.booking.dao.ConnectDB;
import ma.booking.booking.dao.PromotionDao;
import ma.booking.booking.dao.ReservationDao;
import ma.booking.booking.dao.RoomTypeDao;
import ma.booking.booking.model.Promotion;
import ma.booking.booking.model.Reservation;
import ma.booking.booking.model.ReservationRow;
import ma.booking.booking.model.RoomType;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/promotionServlet")
public class PromotionServlet extends HttpServlet {
    public String message = "";
    private PromotionDao promotionDao;
    private RoomTypeDao roomTypeDao;
    public Promotion  pro = new Promotion();
    public ArrayList<RoomType> roomTypes;


    public void init() {
        ConnectDB conn = ConnectDB.connect();
        Connection con = ConnectDB.con;
        promotionDao = new PromotionDao(con);
        roomTypeDao = new RoomTypeDao(con);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        roomTypes = roomTypeDao.getAll();
        System.out.println("list of res ");
        for(RoomType roomType : roomTypes) {
            System.out.println(roomType.getId());
        }
        request.setAttribute("roomTypes", roomTypes);
        request.getRequestDispatcher("admin/addPromotion.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int type_id = Integer.parseInt(request.getParameter("roomType"));
        int price = Integer.parseInt(request.getParameter("newPrice"));
        System.out.println(type_id + " " + price);
        pro.setType_id(type_id);
        pro.setNewPrice(price);
        promotionDao.saveItem(pro);



//        request.setAttribute("message", message);
        request.getRequestDispatcher("admin/addPromotion.jsp").forward(request,response);

    }



}
