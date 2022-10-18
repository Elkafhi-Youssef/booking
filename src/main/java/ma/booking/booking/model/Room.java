package ma.booking.booking.model;

import java.util.ArrayList;

public class Room {
    private int id;
    private String room_type;
    private int price;
    private ArrayList<String> images;

    public Room(int id, String room_type, int price, ArrayList<String> images) {
        this.id = id;
        this.room_type = room_type;
        this.price = price;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
}
