import java.util.Scanner;
public class Ticket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();

        double bp = 12;
        double ff = 0, sf = 0;
        int timeAdj = 0, cdis = 0;
        String voucher = "No";
        String pcat = "Standard";

        if (a.equals("3D")){
            ff = 5;
        }else if (a.equals("IMAX")){
            ff = 8;
        }else if (a.equals("4DX")){
            ff = 10;
        }
        if (c.equals("Premium")){
            sf = 4;
        }else if (c.equals("Recliner")){
            sf = 7;
        }
        if (b.equals("Matinee")){
            timeAdj = -30;
        }else if (b.equals("Prime-Time")){
            timeAdj = 20;
        }else if (b.equals("Late-Night")){
            timeAdj = -20;
        }
        if (d.equals("Senior")){
            cdis = 25;
        }else if (d.equals("Student")){
            cdis = 15;
        }else if (d.equals("Child")) {
            cdis = 30;
        }
        if (b.equals("Matinee") || !d.equals("Adult"))
            voucher = "Yes";

        double price = bp + ff + sf;
        double adj = price * (1 + timeAdj/100.0);
        double fprice = adj * (1 - cdis/100.0);

        if (fprice < 10) {
            pcat = "Value";
        }else if (fprice >= 25) {
            pcat = "Luxury";
        }else if (fprice >= 18) {
            pcat = "Premium";
        }
        System.out.println("Movie Format: " + a);
        System.out.println("Show Time: " + b);
        System.out.println("Seat Category: " + c);
        System.out.println("Customer Type: " + d);
        System.out.println("Base Ticket Price: $" + bp);
        System.out.println("Format Surcharge: $" + ff);
        System.out.println("Seat Upgrade Fee: $" + sf);
        System.out.println("Time-Based Adjustment: " + timeAdj + "%");
        System.out.println("Customer Discount: " + cdis + "%");
        System.out.println("Final Ticket Price: $" + fprice);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + pcat);
    }
}