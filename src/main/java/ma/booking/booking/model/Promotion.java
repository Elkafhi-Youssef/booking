package ma.booking.booking.model;

public class Promotion {
    private int id;
    private int type_id;
    private int newPrice;
    public Promotion(){}
    public Promotion(int type_id) {
        this.type_id = type_id;
    }
    public Promotion(int type_id,int newPrice) {
        this.type_id = type_id;
        this.newPrice = newPrice;
    }

    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
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
