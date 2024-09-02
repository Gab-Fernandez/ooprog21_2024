import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        System.out.println("**************************************************");
        System.out.println("* Carly's makes the food that makes  *");
        System.out.println("*          it a party.                  *");
        System.out.println("**************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = scanner.nextInt();

        final int PRICE_PER_GUEST = 35;
        final int LARGE_EVENT_THRESHOLD = 50;

        int totalPrice = numberOfGuests * PRICE_PER_GUEST;

        boolean isLargeEvent = numberOfGuests >= LARGE_EVENT_THRESHOLD;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_GUEST);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}
