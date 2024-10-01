public class Billing {

    public double computeBill(double price) {
        double total = price + (price * 0.08);
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    public double computeBill(double price, int quantity) {
        double total = (price * quantity) + ((price * quantity) * 0.08);
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    public double computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discountAmount = subtotal * (couponDiscount / 100.0);
        double totalAfterDiscount = subtotal - discountAmount;
        double total = totalAfterDiscount + (totalAfterDiscount * 0.08); 
        System.out.println("The total price for the bill is: $" + total);
        return total;
    }

    public static void main(String[] args) {
        Billing bill = new Billing();

        bill.computeBill(23.2);

        bill.computeBill(23.2, 2);

        bill.computeBill(23.2, 4, 10);
    }
}
