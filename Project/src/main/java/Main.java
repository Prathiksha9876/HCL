
package Project.src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] roomNumbers = {"101", "102", "103", "104", "105"};
        String[] roomTypes = {"Single", "Double", "Double", "Deluxe", "Deluxe"};
        boolean[] available = {true, true, false, true, false};

        int choice;

        do {
            System.out.println("\n=================================");
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
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Enter a number from 1 to 9: ");
                scanner.next();
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Rooms:");
                    for (int i = 0; i < roomNumbers.length; i++) {
                        if (available[i]) {
                            System.out.println(
                                "Room " + roomNumbers[i] + " - " + roomTypes[i]
                            );
                        }
                    }
                    break;

                case 2:
                    System.out.println("Room booking feature is not implemented yet.");
                    break;

                case 3:
                    System.out.println("Guest registration feature is not implemented yet.");
                    break;

                case 4:
                    System.out.println("Modify booking feature is not implemented yet.");
                    break;

                case 5:
                    System.out.println("Cancel booking feature is not implemented yet.");
                    break;

                case 6:
                    System.out.println("Check-in feature is not implemented yet.");
                    break;

                case 7:
                    System.out.println("Check-out feature is not implemented yet.");
                    break;

                case 8:
                    System.out.println("\nRoom Status:");
                    for (int i = 0; i < roomNumbers.length; i++) {
                        String status = available[i] ? "Available" : "Occupied";
                        System.out.println(
                            "Room " + roomNumbers[i] + " - " +
                            roomTypes[i] + " - " + status
                        );
                    }
                    break;

                case 9:
                    System.out.println("Thank you for using the Hotel Room Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 9.");
            }

        } while (choice != 9);

        scanner.close();
    }
}