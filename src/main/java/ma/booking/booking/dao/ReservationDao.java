package ma.booking.booking.dao;

import ma.booking.booking.model.Reservation;
import ma.booking.booking.model.ReservationRow;
import ma.booking.booking.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationDao implements Dao<Reservation> {
    public Connection con;

    public ReservationDao(Connection con) {
        this.con = con;
    }

    @Override
    public Reservation getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Reservation> getAll() {
      return  null;
    }
    public List<ReservationRow> getAllReservation() {
        List< ReservationRow > reservationRows = new ArrayList < > ();
        ReservationRow rr;
        System.out.println("in all re function");
        System.out.println(this.con);
        try {
            PreparedStatement preparedStatement = this.con.prepareStatement("SELECT * FROM  reservations join users on reservations.user_id = users.id join rooms on reservations.room_id = rooms.id join room_types on rooms.id = room_types.id ");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                System.out.println("name: "+rs.getString("name"));
            rr = new ReservationRow(rs.getInt("id"),rs.getString("start_date"),rs.getString("end_date"),rs.getString("name"), rs.getString("type_name"),rs.getInt("status") );
            reservationRows.add(rr);
            }
        }catch (SQLException e) {
            System.out.println("Error in Login Function");
            e.printStackTrace();
        }
        return reservationRows;
    }

    @Override
    public void saveItem(Reservation reservation) {

    }

    @Override
    public void updateItem(Reservation reservation, String[] params) {

    }

    @Override
    public void delete(Reservation reservation) {

    }
}
