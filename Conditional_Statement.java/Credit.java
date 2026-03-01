import java.util.Scanner;
public class Credit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        double c = sc.nextDouble();
        sc.nextLine();
        String d = sc.nextLine();

        double br = 1.0;
        double cbonus = 1.0;
        double tm = 1.0;
        double pm = 1.0;
        String rt = "Standard";

        if(b.equals("Groceries")){
            cbonus = 2.0;
        }else if(b.equals("Dining")) {
            cbonus = 2.5;
        }else if(b.equals("Travel")) {
            cbonus = 3.0;
        }else if(b.equals("Gas")) {
            cbonus = 2.0;
        }
        if(a.equals("Gold")){ 
            tm = 1.25; 
            rt = "Enhanced"; 
        }
        else if(a.equals("Platinum")){ 
            tm = 1.5; 
            rt = "Premium"; 
        }
        else if(a.equals("Black")){ 
            tm = 2.0; 
            rt = "Elite"; 
        }
        if (d.equals("Double-Points")) {
            pm = 2.0;
        }else if (d.equals("Triple-Points")) {
            pm = 3.0;
        }
        double points = c * br * cbonus * tm * pm;
        double cashValue = points * 0.01;

        System.out.println("Card Tier: " + a);
        System.out.println("Purchase Category: " + b);
        System.out.println("Transaction Amount: $" + c);
        System.out.println("Promotional Status: " + d);
        System.out.println("Base Points Rate: " + br + " points per dollar");
        System.out.println("Category Bonus: " + cbonus + "x");
        System.out.println("Tier Multiplier: " + tm + "x");
        System.out.println("Promotional Multiplier: " + pm + "x");
        System.out.println("Points Earned: " + points);
        System.out.println("Equivalent Cash Value: $" + cashValue);
        System.out.println("Rewards Tier: " + rt);
    }
}