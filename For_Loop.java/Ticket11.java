import java.util.Scanner;
public class Ticket11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double origTotal = 0;
        double finalTotal = 0;

        for (int i = 1; i <= n; i++) {
            String seat = sc.next();
            String customer = sc.next();

            double base = 0;
            if (seat.equals("Regular")) base = 12;
            else if (seat.equals("Premium")) base = 18;
            else base = 25;

            int dis = 0;
            if (customer.equals("Child")) dis = 30;
            else if (customer.equals("Senior")) dis = 25;

            double finalPrice = base * (1-dis/100.0);

            origTotal += base;
            finalTotal += finalPrice;

            System.out.println("Ticket "+i+": "+seat+" - "+customer);
            System.out.println("Base Price: $"+base);
            System.out.println("Discount: "+dis+"%");
            System.out.println("Final Price: $"+finalPrice);
            System.out.println("\n");
        }

        boolean group = false;
        if (n >= 5) {
            finalTotal *= 0.9;
            group = true;
        }

        double totalDis = origTotal - finalTotal;

        System.out.println("Total Tickets: " + n);
        System.out.println("Original Total: $" + origTotal);
        System.out.println("Total Discount: $" + totalDis);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (group ? "Yes" : "No"));
    }
}