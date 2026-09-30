import java.util.Scanner;


class InvalidTicketNumberException extends Exception {
    public InvalidTicketNumberException(String message) {
        super(message);
    }
}


class TicketsSoldOutException extends Exception {
    public TicketsSoldOutException(String message) {
        super(message);
    }
}


class MovieBooking {

    private static final String movieName = "3 Idiots";
    private static final int ticketPrice = 200;
    private static int remainingTickets = 50;

    public void displayRemainingTickets() {
        System.out.println(
                "\nRemaining tickets: " + remainingTickets
        );
    }

    public void bookTickets(int numberOfTickets)
            throws InvalidTicketNumberException,
                   TicketsSoldOutException {

        // Validate ticket number
        if (numberOfTickets <= 0) {
            throw new InvalidTicketNumberException(
                    "Number of tickets must be greater than 0."
            );
        }

        // Check whether tickets are available
        if (remainingTickets == 0) {
            throw new TicketsSoldOutException(
                    "Sorry! Tickets are sold out."
            );
        }

        // Check requested tickets against remaining tickets
        if (numberOfTickets > remainingTickets) {
            throw new TicketsSoldOutException(
                    "Sorry! Requested tickets are not available."
            );
        }

        // Deduct tickets only after successful validation
        remainingTickets -= numberOfTickets;

        int totalAmount = numberOfTickets * ticketPrice;

        System.out.println(
                "\nBooking Successful for \"" +
                movieName + "\"!"
        );

        System.out.println(
                "Tickets booked: " + numberOfTickets
        );

        System.out.println(
                "Total amount: ₹" + totalAmount
        );
    }

    public static int getRemainingTickets() {
        return remainingTickets;
    }
}


public class MovieBookingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MovieBooking booking = new MovieBooking();

        while (MovieBooking.getRemainingTickets() > 0) {

            booking.displayRemainingTickets();

            System.out.print(
                    "Enter number of tickets to book: "
            );

            int numberOfTickets = sc.nextInt();

            try {

                booking.bookTickets(numberOfTickets);

            } catch (InvalidTicketNumberException e) {

                System.out.println(
                        "Error: " + e.getMessage()
                );

            } catch (TicketsSoldOutException e) {

                System.out.println(
                        "Error: " + e.getMessage()
                );
            }
        }

        System.out.println("\nSorry! Tickets are sold out.");

        sc.close();
    }
}
