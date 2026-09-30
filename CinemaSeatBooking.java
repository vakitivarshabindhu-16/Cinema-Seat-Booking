import java.util.Scanner;

class CinemaSeatBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int seat;
        int booked;

        while (count < 5) {

            System.out.print("Enter seat number: ");
            seat = sc.nextInt();

            System.out.print("Enter 1 if booked, 0 if free: ");
            booked = sc.nextInt();

            if (booked == 1) {
                System.out.println("Seat Already Booked");
            } 
            else {
                System.out.println("Seat Booked Successfully");
            }

            count = count + 1;
        }

        System.out.println("Booking process completed.");
    }
}