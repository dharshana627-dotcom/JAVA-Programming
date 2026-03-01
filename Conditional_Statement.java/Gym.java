import java.util.Scanner;
public class Gym{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int b = s.nextInt();
        s.nextLine();
        String c = s.nextLine();
        String d = s.nextLine();

        double base = 0;
        double dis = 0;
        double af = 0;
        double addFee = 0;

        if (a.equals("Basic")){
            base = 40;
        }else if (a.equals("Premium")){
            base = 80;
        } 
        else if (a.equals("Elite")) {
            base = 120;
        }else {
            base = 150;
        }
        if (b == 6) {
            dis = 10;
        }else if (b == 12) {
            dis = 15;
        }else if (b == 24) {
            dis = 25;
        }
        if (c.equals("Regional")) {
            af = 20;
        }else if (c.equals("Nationwide")) {
            af = 50;
        }
        if (d.equals("Personal-Training")) {
            addFee = 100;
        }else if (d.equals("Classes")) {
            addFee = 50;
        }else if (d.equals("Full-Package")) {
            addFee = 200;
        }
        double disBase = base * (1 - dis / 100);
        double mt = disBase + af + addFee;
        double ct = mt * b;
        double sav = (base + af + addFee) * b - ct;

        String cat;
        if (a.equals("Basic")) {
            cat = "Budget";
        }else if (a.equals("Premium") && mt < 120) {
            cat = "Standard";
        }else if (a.equals("Premium") || a.equals("Elite")) {
            cat = "Premium";
        }else {
            cat = "Luxury";
        }
        System.out.println("Membership Tier: " + a);
        System.out.println("Contract Length: " + b + " months");
        System.out.println("Access Level: " + c);
        System.out.println("Add-Ons: " + d);
        System.out.println("Base Monthly Fee: $" + base);
        System.out.println("Contract Discount: " + dis + "%");
        System.out.println("Access Fee: $" + af);
        System.out.println("Add-On Fee: $" + addFee);
        System.out.println("Monthly Total: $" + mt);
        System.out.println("Contract Total: $" + ct);
        System.out.println("Savings vs Month-to-Month: $" + sav);
        System.out.println("Membership Category: " + cat);
    }
}