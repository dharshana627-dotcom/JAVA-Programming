import java.util.*;
public class HealthInsurance{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        int a=s.nextInt();
        String b=str.next();
        String b1="Smoker";
        String b2="Non-Smoker";
        String c=str.next();
        String c1="Yes";
        String c2="No";
        String d=str.next();
        String d1="Basic";
        String d2="Standard";
        String d3="Premium";
        
        double bs=0;
        if (a >= 18 && a <= 30) {
            if (d.equals(d1)) bs = 200;
            else if (d.equals(d2)) bs = 300;
            else if (d.equals(d3)) bs = 500;
        } 
        else if (a >= 31 && a <= 50) {
            if (d.equals(d1)) bs = 250;
            else if (d.equals(d2)) bs = 350;
            else if (d.equals(d3)) bs = 600;
        } 
        else if (a >= 51 && a <= 65) { 
            if (d.equals(d1)) bs = 350;
            else if (d.equals(d2)) bs = 450;
            else if (d.equals(d3)) bs = 700;
        } 
        else if (a >= 66) {
            if (d.equals(d1)) bs = 400;
            else if (d.equals(d2)) bs = 550;
            else if (d.equals(d3)) bs = 800;
        }
        double sc = 0;
        if (b.equals(b1) && c.equals(c1)) {
            sc = 0.70;
        } else if (b.equals(b1)) {
            sc = 0.40;
        } else if (c.equals(c1)) {
            sc = 0.30;
        }

        double risk = bs * sc;
        double total = bs + risk;
        System.out.println("Age: "+a);
        System.out.println("Smoking Status: "+b);
        System.out.println("Pre-existing Conditions: "+c);
        System.out.println("Coverage: Tier: "+d);
        System.out.println("Base Premium: $" + bs);
        System.out.println("Risk Surcharge: $" + risk);
        System.out.println("Total Monthly Premium: $" + total);
    }
}