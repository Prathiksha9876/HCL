
public class Booking {
    private int bookingId;
    private Guest guest;
    private Room room;
    private int numberOfNights;
    private String bookingStatus;

    
public Booking(int bookingId, Guest guest, Room room, int numberOfNights)
        throws InvalidBookingException {
    this.bookingId = bookingId;
    this.guest = guest;
    this.room = room;
    this.numberOfNights = numberOfNights;

   
if (numberOfNights <= 0) {
    throw new InvalidBookingException(
        "Number of nights must be greater than zero."
    );
}

if (!room.isAvailable()) {
    throw new InvalidBookingException(
        "Room is already booked."
    );
}

this.bookingStatus = "CONFIRMED";
room.setAvailable(false);

}

    
public double calculateTotalAmount() {
    return room.getPricePerNight() * numberOfNights;
}

    public void displayBookingDetails() {
        System.out.println("Booking ID: " + bookingId);
      System.out.println("Guest Name: " + guest.getGuestName());
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Total Amount: Rs." + calculateTotalAmount());
        System.out.println("Booking Status: " + bookingStatus);
    }
    


}
