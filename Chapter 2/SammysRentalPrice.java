import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("*S   Sammy's make it fun in the sun.     S *");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = scanner.nextInt();

        final int RATE_PER_HOUR = 40;
        final int RATE_PER_ADDITIONAL_MINUTE = 1;
        final int MINUTES_IN_AN_HOUR = 60;

        int hours = totalMinutes / MINUTES_IN_AN_HOUR;
        int minutes = totalMinutes % MINUTES_IN_AN_HOUR;

        int totalPrice = (hours * RATE_PER_HOUR) + (minutes * RATE_PER_ADDITIONAL_MINUTE);

        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes rented: " + minutes);
        System.out.println("Total price: $" + totalPrice);
    }
}
