import java.util.Scanner;
public class Parking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zone = sc.nextLine();
        double hours = sc.nextDouble();
        sc.nextLine();
        String vehicle = sc.nextLine();
        String membership = sc.nextLine();

        double baseRate = 5.0;
        int zonePremium = 0;
        double surcharge = 0.0;
        int discount = 0;

        String category = "";
        String dailyCap = "No";

        if (zone.equalsIgnoreCase("Downtown")) {
            zonePremium = 50;
            category = "Premium";
        }else if (zone.equalsIgnoreCase("Business-District")) {
            zonePremium = 30;
            category = "Premium";
        }else if (zone.equalsIgnoreCase("Airport")) {
            zonePremium = 100;
            category = "Luxury";
        }else {
            zonePremium = 0;
            category = "Standard";
        }
        if (vehicle.equalsIgnoreCase("SUV")) {
            surcharge = 3.0;
        }else if (vehicle.equalsIgnoreCase("Oversized")) {
            surcharge = 5.0;
        }else {
            surcharge = 0.0;
        }
        if (membership.equalsIgnoreCase("Monthly")) {
            discount = 20;
        }else if (membership.equalsIgnoreCase("Annual")) {
            discount = 25;
        }else if (membership.equalsIgnoreCase("VIP")) {
            discount = 30;
        }else {
            discount = 0;
        }
        double rateWithPremium =baseRate + (baseRate * zonePremium / 100.0);
        double total = (rateWithPremium + surcharge) * hours;
        total = total - (total * discount / 100.0);
        if (zone.equalsIgnoreCase("Airport") && hours >= 24) {
            dailyCap = "Yes";
        }
        System.out.println("Location Zone: " + zone);
        System.out.println("Parking Duration: " + hours + " hours");
        System.out.println("Vehicle Type: " + vehicle);
        System.out.println("Membership Status: " + membership);
        System.out.println("Base Hourly Rate: $" + baseRate);
        System.out.println("Zone Premium: " + zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + surcharge);
        System.out.println("Membership Discount: " + discount + "%");
        System.out.println("Total Parking Fee: $" + total);
        System.out.println("Daily Cap Applied: " + dailyCap);
        System.out.println("Rate Category: " + category);
    }
}