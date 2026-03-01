import java.util.Scanner;
public class Restaurant{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        double c = s.nextDouble();
        s.nextLine();
        String d = s.nextLine();

        double bdis = 0;
        double adj = 0;
        double sf = 0;
        String prio = "";
        int prepTime = 0;

        if (b.equals("Gold")) {
            bdis = 15;
        } else if (b.equals("Silver")) {
            bdis = 10;
        } else if (b.equals("Bronze")) {
            bdis = 5;
        } else {
            bdis = 0;
        }

        if (d.equals("Late-Night")) {
            adj = -5;
        } else {
            adj = 0;
        }

        if (a.equals("Delivery")) {
            sf = c * 0.10;
        } else if (a.equals("Takeout")) {
            sf = c * 0.03;
        } else {
            sf = 0;
        }

        double tdis = bdis + adj;
        double dis = c * (1 - tdis / 100);
        double famnt = dis + sf;
        if (d.equals("Peak") && a.equals("Delivery")) {
            prio = "High";
            prepTime = (c >= 80) ? 25 : 30;
        } else if (d.equals("Regular")) {
            prio = "Medium";
            prepTime = (c >= 100) ? 25 : 20;
        } else {
            prio = "Low";
            prepTime = 15;
        }

        System.out.println("Order Type: " + a);
        System.out.println("Loyalty Status: " + b);
        System.out.println("Order Value: $" + c);
        System.out.println("Time Slot: " + d);
        System.out.println("Base Discount: " + bdis + "%");
        System.out.println("Time-Based Adjustment: " + adj + "%");
        System.out.println("Service Fee: $" + sf);
        System.out.println("Final Amount: $" + famnt);
        System.out.println("Kitchen Priority: " + prio);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");
    }
}