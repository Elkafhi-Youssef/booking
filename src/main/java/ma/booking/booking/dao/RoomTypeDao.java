package ma.booking.booking.dao;

import ma.booking.booking.model.ReservationRow;
import ma.booking.booking.model.RoomType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomTypeDao implements Dao<RoomType>{
    public Connection con;

    public RoomTypeDao(Connection con) {
        this.con = con;
    }
    @Override
    public RoomType getById(int id) {
        return null;
    }

    @Override
    public ArrayList<RoomType> getAll() {
        ArrayList<RoomType> roomsTypes = new ArrayList < > ();
        RoomType roomType = new RoomType(); ;
        System.out.println("in all re function");

        try {
            PreparedStatement preparedStatement = this.con.prepareStatement("SELECT * FROM  room_types ");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                roomType.setId(rs.getInt("id"));
                roomType.setName_room(rs.getString("type_name"));
                roomType.setPrice(rs.getInt("price"));
                System.out.println("name: "+rs.getString("type_name"));

                roomsTypes.add(roomType);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return roomsTypes;
    }

    @Override
    public void saveItem(RoomType roomType) {

    }

    @Override
    public void updateItem(RoomType roomType, String[] params) {

    }

    @Override
    public void delete(RoomType roomType) {

    }
}
