
public class HotelApp {
    public static void main(String[] args) {

        Room room = new Room(101, "Deluxe", 2500.0);
        Guest guest = new Guest(1, "Arun", "9876543210");

        System.out.println("=== BEFORE BOOKING ===");
        room.displayRoomDetails();

        System.out.println("\n=== FIRST BOOKING ===");

        try {
            Booking booking = new Booking(1001, guest, room, 2);
            booking.displayBookingDetails();

        } catch (InvalidBookingException e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }

        System.out.println("\n=== SECOND BOOKING ===");

        try {
            Booking secondBooking = new Booking(1002, guest, room, 1);
            secondBooking.displayBookingDetails();

        } catch (InvalidBookingException e) {
            System.out.println("Second Booking Failed: " + e.getMessage());
        }

        System.out.println("\n=== AFTER BOOKING ===");
        room.displayRoomDetails();
    }
}
