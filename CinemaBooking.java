import java.util.Scanner;

public class CinemaBooking {

    boolean[] seats = new boolean[10];
    String movieName;
    int ticketPrice = 150;

    // Constructor
    CinemaBooking(String name) {
        movieName = name;
    }

    // Display available and booked seats
    void displaySeats() {
        System.out.println("\nMovie: " + movieName);
        System.out.println("Ticket Price: Rs." + ticketPrice);

        System.out.println("\nSeat Status:");

        for (int i = 0; i < 10; i++) {
            if (seats[i] == false) {
                System.out.println("Seat " + (i + 1) + " - Available");
            } else {
                System.out.println("Seat " + (i + 1) + " - Booked");
            }
        }
    }

    // Book a seat
    void bookSeat(int seatNumber) {

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid Seat Number!");
        } 
        else if (seats[seatNumber - 1] == true) {
            System.out.println("Seat Already Booked!");
        } 
        else {
            seats[seatNumber - 1] = true;

            System.out.println("Seat Booked Successfully!");
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Ticket Price: Rs." + ticketPrice);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO CINEMA SEAT BOOKING");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        CinemaBooking booking = new CinemaBooking("Pushpa 2");

        int choice;

        do {
            System.out.println("\n===== CINEMA BOOKING MENU =====");
            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Exit");

            System.out.print("Enter Your Choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid choice! Enter a number.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    booking.displaySeats();
                    break;

                case 2:
                    System.out.print("Enter Seat Number (1-10): ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid seat number!");
                        sc.next();
                        break;
                    }

                    int seatNumber = sc.nextInt();

                    booking.bookSeat(seatNumber);
                    break;

                case 3:
                    System.out.println("Thank You, " + customerName);
                    System.out.println("Visit Again!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}