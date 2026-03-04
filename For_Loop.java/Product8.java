import java.util.Scanner;
public class Product8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalItems = 0;
        double origTotal = 0;
        double finalTotal = 0;

        for (int i = 0; i < n; i++) {
            String proName = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            int dis;
            if (qty == 1) dis = 0;
            else if (qty <= 4) dis = 10;
            else if (qty <= 9) dis = 15;
            else dis = 20;

            double subtotal = price * qty * (1 - dis / 100.0);
            double original = price * qty;

            totalItems += qty;
            origTotal += original;
            finalTotal += subtotal;

            System.out.println("Product: " + proName);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Discount: " + dis + "%");
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("\n");
        }

        double totalDis = origTotal - finalTotal;
        double sav = (totalDis / origTotal) * 100;

        System.out.println();
        System.out.println("Total Items: " + totalItems);
        System.out.println("Original Total: $" + origTotal);
        System.out.println("Total Discount: $" + totalDis);
        System.out.println("Final Total: $" + finalTotal);
        System.out.printf("Savings: %.2f%%\n", sav);
    }
}