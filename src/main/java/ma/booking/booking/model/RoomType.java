package ma.booking.booking.model;

public class RoomType {
    private int id;
    private String name_room;
    private int price;
    public RoomType(){};
    public RoomType(int id, String name_room, int price) {
        this.id = id;
        this.name_room = name_room;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_room() {
        return name_room;
    }

    public void setName_room(String name_room) {
        this.name_room = name_room;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "id=" + id +
                ", name_room='" + name_room + '\'' +
                ", price=" + price +
                '}';
    }
}
