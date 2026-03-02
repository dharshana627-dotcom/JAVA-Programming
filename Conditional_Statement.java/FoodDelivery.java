import java.util.Scanner;
public class FoodDelivery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();

        double baseFee = 3.0;
        double ds = a * 1.0;

        double peak = 0;
        if (c.equals("Lunch")) {
            peak = 2.5;
        }else if (c.equals("Dinner")) {
            peak = 2.0;
        }else if (c.equals("Late-Night")) {
            peak = 1.5;
        }
        double ws = 0;
        if (d.equals("Rain")) {
            ws = 2;
        }else if (d.equals("Snow")) {
            ws = 3;
        }else if (d.equals("Storm")) {
            ws = 5;
        }
        double discount = 0;
        if (b >= 30 && b <=49.99) {
            discount = 1;
        }else if (b >= 50 && b <= 74.99) {
            discount = 3;
        }else if (b >= 75) {
            discount = 5;
        }
        double finalFee = baseFee + ds + peak + ws - discount;
        if (finalFee < 2.99) {
            finalFee = 2.99;
        }
        int time = (int)(a * 8);

        if (c.equals("Lunch") || c.equals("Dinner")) {
            time += 10;
        }
        if (d.equals("Rain")) {
            time += 5;
        }else if (d.equals("Snow")) {
            time += 10;
        }else if (d.equals("Storm")) {
            time += 15;
        }
        String prio;
        if (b > 60) {
            prio = "Express";
        }else if (c.equals("Lunch") || c.equals("Dinner")) {
            prio = "High";
        }else {
            prio = "Standard";
        }

        System.out.println("Delivery Distance: " + a + " miles");
        System.out.println("Order Value: $" + b);
        System.out.println("Time Slot: " + c);
        System.out.println("Weather Condition: " + d);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + ds);
        System.out.println("Peak Time Surcharge: $" + peak);
        System.out.println("Weather Surcharge: $" + ws);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + time + " minutes");
        System.out.println("Service Priority: " + prio);
    }
}