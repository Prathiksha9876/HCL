
public class Guest {
    private int guestId;
    private String guestName;
    private String phoneNumber;

    public Guest(int guestId, String guestName, String phoneNumber) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.phoneNumber = phoneNumber;
    }

    public void displayGuestDetails() {
        System.out.println("Guest ID: " + guestId);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Phone Number: " + phoneNumber);
    }
    public String getGuestName() {
    return guestName;
}
}
