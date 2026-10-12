
public class Room {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean available;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.available = true;
    }

    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: Rs." + pricePerNight);
        System.out.println("Available: " + available);
    }
    public boolean isAvailable() {
    return available;
}

public void setAvailable(boolean available) {
    this.available = available;
}
public double getPricePerNight() {
    return pricePerNight;
}
}
