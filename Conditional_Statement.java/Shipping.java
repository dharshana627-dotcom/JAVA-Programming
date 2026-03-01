import java.util.Scanner;
public class Shipping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();

        double br = 0, zm = 1, ss = 0;
        double ws = a * 1;
        String deli = "";
        String ser = "";

        if (c.equals("Economy")){ 
            br = 5; 
            ser = "Budget";
        }else if (c.equals("Standard")){ 
            br = 10; 
            ser = "Standard"; 
        }else if (c.equals("Express")) { 
            br = 25; 
            ser = "Priority"; 
        }else if (c.equals("Overnight")) { 
            br = 50; 
            ser = "Premium"; 
        }
        if (b.equals("Local")){
            zm = 1.0;
        }else if (b.equals("Regional")){
            zm = 1.2;
        }else if (b.equals("National")) {
            zm = 1.5;
        }else if (b.equals("International")) {
            zm = 3.0;
        }
        if (d.equals("Medium")) {
            ss = 5;
        }else if (d.equals("Large")) {
            ss = 15;
        }else if (d.equals("Oversized")) {
            ss = 30;
        }
        if (c.equals("Overnight")) {
            deli = "1";
        }else if (c.equals("Express")) {
            if (b.equals("Local")) {
                deli = "1";
            }else if (b.equals("Regional")) {
                deli = "1-2";
            }else if (b.equals("National")) {
                deli = "2-3";
            }else {
                deli = "3-5";
            }
        }
        else if (c.equals("Standard")) {
            if (b.equals("Local")) {
                deli = "2-3";
            }else if (b.equals("Regional")) {
                deli = "3-5";
            }else if (b.equals("National")) {
                deli = "5-7";
            }else {
                deli = "10-14";
            }
        }
        else {
            if (b.equals("Local")) {
                deli = "3-5";
            }else if (b.equals("Regional")) {
                deli = "5-7";
            }else if (b.equals("National")) {
                deli = "7-10";
            }else {
                deli = "14-21";
            }
        }

        double bc = (br + ws) * zm;
        double total = bc + ss;

        System.out.println("Package Weight: " + a + " lbs");
        System.out.println("Destination Zone: " + b);
        System.out.println("Shipping Speed: " + c);
        System.out.println("Package Size: " + d);
        System.out.println("Base Shipping Rate: $" + br);
        System.out.println("Weight Surcharge: $" + ws);
        System.out.println("Zone Multiplier: " + zm + "x");
        System.out.println("Size Surcharge: $" + ss);
        System.out.println("Total Shipping Cost: $" + total);
        System.out.println("Estimated Delivery: " + deli + " business days");
        System.out.println("Service Level: " + ser);
    }
}