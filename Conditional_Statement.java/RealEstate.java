import java.util.Scanner;
public class RealEstate{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        double bs = 0.0;
        int adj = 0;
        double bonus = 0.0;
        String mc = "";

        if (a.equalsIgnoreCase("Prime")) {
            bs = 400;
        } else if (a.equalsIgnoreCase("Urban")) {
            bs = 300;
        } else if (a.equalsIgnoreCase("Suburban")) {
            bs = 180;
        } else if (a.equalsIgnoreCase("Rural")) {
            bs = 100;
        } else {
            System.out.println("Invalid location tier");
            return;
        }
        if (c <= 5) {
            adj = 0;
        } else if (c >=6 && c <= 15) {
            if (c <= 10) {
                adj = -5;
            } else {
                adj = -10;
            }
        } else if (c >=16 && c <= 30) {
            if (c <= 25) {
                adj = -15;
            } else {
                adj = -20;
            }
        } else {
            adj = -25;
        }

        double baseValue = b * bs;
        double adjValue = baseValue * (1 + adj / 100.0);
        double fValue = adjValue + bonus;
        if (d >= 80 && d <= 100) {
            bonus = baseValue * 0.10;
        } else if (d >= 60 && d <=79) {
            bonus = baseValue * 0.05;
        } else if (d >= 40 && d <= 59) {
            bonus = baseValue * 0.02;
        } else {
            bonus = 0;
        }
        if ((a.equalsIgnoreCase("Prime") || 
             a.equalsIgnoreCase("Urban")) && c < 15) {
            mc = "Hot";
        } else if (a.equalsIgnoreCase("Suburban")) {
            mc = "Stable";
        } else if (a.equalsIgnoreCase("Rural") || c > 30) {
            mc = "Slow";
        } else {
            mc = "Stable";
        }

        System.out.println("Location Tier: " + a);
        System.out.println("Square Footage: " + b + " sq ft");
        System.out.println("Property Age: " + c + " years");
        System.out.println("Amenity Score: " + d);
        System.out.println("Base Price Per Sq Ft: $" + bs);
        System.out.println("Age Adjustment: " + adj + "%");
        System.out.println("Amenity Bonus: $" + bonus);
        System.out.println("Estimated Property Value: $" + fValue);
        System.out.println("Market Category: " + mc);

    }
}