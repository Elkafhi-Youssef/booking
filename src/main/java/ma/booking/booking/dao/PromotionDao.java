package ma.booking.booking.dao;

import ma.booking.booking.model.Promotion;
import ma.booking.booking.model.ReservationRow;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class PromotionDao implements Dao<Promotion> {
    public Connection con;
    public PromotionDao(Connection con) {
        this.con = con;
    }
    @Override
    public Promotion getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Promotion> getAll() {
        return null;
    }

    @Override
    public void saveItem(Promotion promotion) {
        try {
            PreparedStatement preparedStatement = this.con.prepareStatement("INSERT INTO promotions (type_id) values (?)");
            preparedStatement.setInt(1, promotion.getType_id());
            if(preparedStatement.executeUpdate() > 0){
                this.updatePrice(promotion.getNewPrice(), promotion.getType_id());
            }
        }catch (SQLException e) {
            System.out.println("Error in Login Function");
            e.printStackTrace();
        }

    }
    public int updatePrice(int newPrice,int id){
        int operation = 0;
        try {
            PreparedStatement preparedStatement = this.con.prepareStatement("update room_types set price = ? where id = ?");
            preparedStatement.setInt(1, newPrice);
            preparedStatement.setInt(2, id);
           operation = preparedStatement.executeUpdate();
        }catch (SQLException e) {
            System.out.println("Error in Login Function");
            e.printStackTrace();
        }
        return operation;
    }
    @Override
    public void updateItem(Promotion promotion, String[] params) {

    }

    @Override
    public void delete(Promotion promotion) {

    }
}
