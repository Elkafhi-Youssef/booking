package ma.booking.booking.model;

public class Promotion {
    private int id;
    private int type_id;

    public Promotion(int id, int type_id) {
        this.id = id;
        this.type_id = type_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }
}
