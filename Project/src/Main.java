import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] roomNumbers = {"101", "102", "103", "104", "105"};
        String[] roomTypes = {"Single", "Double", "Double", "Deluxe", "Deluxe"};
        boolean[] available = {true, true, false, true, false};

        System.out.println("=================================");
        System.out.println(" Hotel Room Booking System");
        System.out.println("=================================");

        System.out.println("1. Search Available Rooms");
        System.out.println("2. Book a Room");
        System.out.println("3. Register Guest");
        System.out.println("4. Modify Booking");
        System.out.println("5. Cancel Booking");
        System.out.println("6. Check-In");
        System.out.println("7. Check-Out");
        System.out.println("8. View Room Status");
        System.out.println("9. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.println("\nAvailable Rooms:");
            System.out.println("----------------");

            for (int i = 0; i < roomNumbers.length; i++) {

                if (available[i]) {
                    System.out.println(
                            "Room " + roomNumbers[i] +
                            " - " + roomTypes[i]
                    );
                }
            }

        } else if (choice == 9) {

            System.out.println("Thank you for using the Hotel Room Booking System.");

        } else {

            System.out.println("This feature will be added soon.");

        }

        scanner.close();
    }
}