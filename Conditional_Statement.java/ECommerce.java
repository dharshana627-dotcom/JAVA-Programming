import java.util.*;
public class ECommerce{
    public static void main(String[] args){
        Scanner str=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        
        String a=str.next();
        String a1="Bronze";
        String a2="Silver";
        String a3="Gold";
        String a4="Platinum";
        double b=s.nextDouble();
        String c=str.next();
        String c1="Electronics";
        String c2="Fashion";
        String c3="Groceries";
        String c4="Books";
        String d=str.next();
        String d1="Prime";
        String d2="Regular";
        System.out.println("Loyalty Tier: "+a);
        System.out.println("Cart Value: $"+b);
        System.out.println("Product Category: "+c);
        System.out.println("Membership: "+d);
        
        int bsdis=0;
        int adis=0;
        if(a.equals(a1)){
            bsdis=5;
        }
        if(a.equals(a2)){
            bsdis=8;
        }
        if(a.equals(a3)){
            bsdis=12;
        }
        if(a.equals(a4)){
            bsdis=15;
        }
        if((c.equals(c1)) && (d.equals(d1))){
            if(b>=500 && b<=999){
                adis=5+3;
            }else if(b>=1000 && b<=1999){
                adis=5+5;
            }else if(b>=2000){
                adis=5+7;
            }
        }else if((c.equals(c2))){
            if(b>=500 && b<=999){
                adis=3+3;
            }else if(b>=1000 && b<=1999){
                adis=3+5;
            }else if(b>=2000){
                adis=3+7;
            }
        }else if((c.equals(c3)) && (d.equals(d1))){
            if(b>=500 && b<=999){
                adis=5+3;
            }else if(b>=1000 && b<=1999){
                adis=5+5;
            }else if(b>=2000){
                adis=5+7;
            }
        }else if((c.equals(c4)) && (b>300)){
            if(b>=500 && b<=999){
                adis=2+3;
            }else if(b>=1000 && b<=1999){
                adis=2+5;
            }else if(b>=2000){
                adis=2+7;
            }
        }
        int total=bsdis+adis;
        double fprice=b*(1-total/100);
        double sa=b-fprice;

        System.out.println("Base Discount: "+bsdis+"%");
        System.out.println("Additional Discount: "+adis+"%");
        System.out.println("Total Discount: "+total+"%");
        System.out.println("Final Price: $"+fprice);
        System.out.println("Savings: $"+sa);
    }
}