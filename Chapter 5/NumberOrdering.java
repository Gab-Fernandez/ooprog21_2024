import java.util.Scanner;

public class NumberOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        int mid = num1 + num2 + num3 - max - min;

        System.out.println("Numbers in ascending order: " + min + " " + mid + " " + max);

        scanner.close();
    }
}     