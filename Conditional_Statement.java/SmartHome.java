import java.util.Scanner;
public class SmartHome{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        double b = s.nextDouble();
        double c = s.nextDouble();
        s.nextLine();
        String d = s.nextLine();

        double baseRate = 0.0;
        double rm = 1.0;
        double rc = 0.0;
        double total = 0.0;
        String recom = "";
        double ps = 0.0;

        if (d.equalsIgnoreCase("Basic")) {
            baseRate = 0.18;
        } else if (d.equalsIgnoreCase("Time-of-Use")) {
            baseRate = 0.15;
        } else if (d.equalsIgnoreCase("Premium-Green")) {
            baseRate = 0.12;
        }

        if (a.equalsIgnoreCase("Peak")) {
            if (d.equalsIgnoreCase("Time-of-Use")) {
                rm = 1.8;
            } else if (d.equalsIgnoreCase("Premium-Green")) {
                rm = 1.5;
            } else {
                rm = 1.5;
            }
        } else if (a.equalsIgnoreCase("Off-Peak")) {
            if (d.equalsIgnoreCase("Time-of-Use")) {
                rm = 0.8;
            } else {
                rm = 1.0;
            }
        } else if (a.equalsIgnoreCase("Super-Off-Peak")) {
            if (d.equalsIgnoreCase("Premium-Green")) {
                rm = 0.6;
            } else {
                rm = 0.5;
            }
        }
        rc = (b * c / 100.0) * baseRate;
        total = (b * baseRate * rm) - rc;
        if (total < 0){
            total = 0;
        }
        if (a.equalsIgnoreCase("Peak") && c < 30) {
            recom = "Shift high-power appliances to Off-Peak hours";
            ps = b * baseRate * (rm - 0.8);
        } else if (c >= 70) {
            recom = "Great renewable usage! Minor peak reduction possible";
            ps = b * baseRate * (rm - 1.2);
        } else if (d.equalsIgnoreCase("Basic") && b > 20) {
            recom = "Consider upgrading to Time-of-Use plan";
            ps = b * 0.03;
        } else if (a.equalsIgnoreCase("Super-Off-Peak")) {
            recom = "Excellent! Maximize appliance use during this period";
            ps = 0;
        } else {
            recom = "Good timing! Consider increasing renewable capacity";
            ps = 0;
        }

        System.out.println("Time of Day: " + a);
        System.out.println("Power Consumption: " + b + " kWh");
        System.out.println("Renewable Energy: " + c + "%");
        System.out.println("Rate Tier: " + d);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rm + "x");
        System.out.println("Renewable Credit: $" + rc);
        System.out.println("Total Cost: $" + total);
        System.out.println("Optimization Recommendation: " + recom);
        System.out.println("Potential Savings: $" + ps);

    }
}