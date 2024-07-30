package ticket_booking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details in CSV format: stageEvent, customer, noOfSeats");
        String input = sc.nextLine();
        String[] details = input.split(",");

        String stageEvent = details[0].trim();
        String customer = details[1].trim();
        Integer noOfSeats = Integer.parseInt(details[2].trim());

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        System.out.println("Choose Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Online Wallet");
        System.out.println("3. Credit Card");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter amount:");
                double cashAmount = sc.nextDouble();
                booking.makePayment(cashAmount);
                break;
            case 2:
                System.out.println("Enter wallet number:");
                String walletNumber = sc.next();
                System.out.println("Enter amount:");
                double walletAmount = sc.nextDouble();
                booking.makePayment(walletNumber, walletAmount);
                break;
            case 3:
                System.out.println("Enter credit card number:");
                long creditCardNumber = sc.nextLong();
                System.out.println("Enter amount:");
                double cardAmount = sc.nextDouble();
                booking.makePayment(creditCardNumber, cardAmount);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}
