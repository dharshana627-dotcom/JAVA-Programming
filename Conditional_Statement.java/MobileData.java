import java.util.Scanner;
public class MobileData{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();

        String plan;
        double baseCost;
        double dataOver = 0;
        double callOver = 0;

        if (a <= 2 && b <= 500) {
            plan = "Basic 2GB";
            baseCost = 25;
        } else if (a <= 5 && b <= 1000) {
            plan = "Standard 5GB";
            baseCost = 40;
            if (a > 5) {
                dataOver = (a - 5) * 10;
            }
        } else if (a <= 25 && b <= 2000) {
            plan = "Premium Unlimited";
            baseCost = 70;
        } else {
            plan = "Unlimited Max";
            baseCost = 90;
        }

        double inter = 0;
        if (c.equals("Light")) {
            inter = 5;
        }else if (c.equals("Moderate")) {
            inter = 15;
        }else if (c.equals("Heavy")) {
            inter = 30;
        }
        double deviceFee = 0;
        if (d.equals("Smartphone")) {
            deviceFee = 10;
        }else if (d.equals("Tablet")) {
            deviceFee = 10;
        }else if (d.equals("Hotspot")) {
            deviceFee = 20;
        }

        double total = baseCost + dataOver + callOver + inter + deviceFee;
        String cat;
        if (plan.contains("Basic")) {
            cat = "Budget";
        }else if (plan.contains("Standard")) {
            cat = "Standard";
        }else if (plan.contains("Premium")) {
            cat = "Premium";
        }else {
            cat = "Unlimited";
        }
        double sav = 0;
        if (plan.equals("Standard 5GB") && a > 5) {
            sav = 5;
        }
        System.out.println("Data Usage: " + a + " GB");
        System.out.println("Call Minutes: " + b + " minutes");
        System.out.println("International Usage: " + c);
        System.out.println("Device Type: " + d);
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOver);
        System.out.println("Call Overage: $" + callOver);
        System.out.println("International Fee: $" + inter);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + total);
        System.out.println("Potential Savings: $" + sav);
        System.out.println("Plan Category: " + cat);
    }
}