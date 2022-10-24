package ma.booking.booking.model;

public class ReservationRow {
    private int id;
    private String start_date;
    private String end_date;
    private String name;
    private String roomType;
    private int status;

    public ReservationRow(int id, String start_date, String end_date, String name, String roomType, int status) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.name = name;
        this.roomType = roomType;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
