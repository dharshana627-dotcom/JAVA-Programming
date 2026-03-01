import java.util.Scanner;
public class Hotel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt();
        sc.nextLine();
        String d = sc.nextLine();

        double br = 0, sm = 1;
        int sdis = 0, ldis = 0;
        String upg = "None";

        if (a.equals("Standard")) {
            br = 150;
        }else if (a.equals("Deluxe")) {
            br = 300;
        }else if (a.equals("Suite")) {
            br = 500;
        }else if (a.equals("Presidential")) {
            br = 1000;
        }
        if (b.equals("Off-Peak")) {
            sm = 0.7;
        }else if (b.equals("Regular")) {
            sm = 1.0;
        }else if (b.equals("Peak")) {
            sm = 1.5;
        }else if (b.equals("Holiday")) {
            sm = 2.0;
        }
        if(c >= 1 && c <= 4){
            sdis=0;
        }
        else if (c >= 5 && c <= 7) {
            sdis = 5;
        }else if (c >= 8 && c <= 14) {
            sdis = 10;
        }else if (c >= 15) {
            sdis = 20;
        }
        if (d.equals("Member")) {
            ldis = 10;
            upg = "Free breakfast";
        } 
        else if (d.equals("Gold")) {
            ldis = 15;
            upg = "Free breakfast and spa access";
        } 
        else if (d.equals("Platinum")) {
            ldis = 20;
            upg = "Concierge service, airport transfer, and fine dining";
        }

        double sr = br * sm;
        double nr = sr * (1 - sdis/100.0) * (1 - ldis/100.0);
        double total = nr * c;

        System.out.println("Room Category: " + a);
        System.out.println("Season: " + b);
        System.out.println("Nights Booked: " + c);
        System.out.println("Loyalty Tier: " + d);
        System.out.println("Base Rate Per Night: $" + br);
        System.out.println("Seasonal Multiplier: " + sm + "x");
        System.out.println("Extended Stay Discount: " + sdis + "%");
        System.out.println("Loyalty Discount: " + ldis + "%");
        System.out.println("Nightly Rate: $" + nr);
        System.out.println("Total Booking Cost: $" + total);
        System.out.println("Complimentary Upgrades: " + upg);
    }
}