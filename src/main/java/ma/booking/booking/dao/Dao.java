package ma.booking.booking.dao;

import java.util.ArrayList;

public interface Dao<T> {

     T getById(int id);

    ArrayList<T> getAll();

    void saveItem(T t);

    void updateItem(T t, String[] params);

    void delete(T t);
}
