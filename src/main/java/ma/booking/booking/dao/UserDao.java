package ma.booking.booking.dao;

import ma.booking.booking.model.User;

import java.sql.Connection;
import java.util.ArrayList;

public class UserDao implements Dao<User> {
    ConnectDB conn = ConnectDB.connect();
    static Connection con = ConnectDB.con;
    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        return null;
    }

    @Override
    public void saveItem(User users) {

    }

    @Override
    public void updateItem(User users, String[] params) {

    }

    @Override
    public void delete(User users) {

    }
}

