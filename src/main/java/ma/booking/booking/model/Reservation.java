package ma.booking.booking.model;

import java.util.ArrayList;

public class Reservation {
    private String start_date;
    private String end_date;
    private int user_id;
    private int room_id;
    private ArrayList<String> extras;

    public Reservation(String start_date, String end_date, int user_id, int room_id, ArrayList<String> extras) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.user_id = user_id;
        this.room_id = room_id;
        this.extras = extras;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public ArrayList<String> getExtras() {
        return extras;
    }

    public void setExtras(ArrayList<String> extras) {
        this.extras = extras;
    }
}
