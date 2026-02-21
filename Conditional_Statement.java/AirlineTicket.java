import java.util.*;
public class AirlineTicket{
    public static void main(String[] args){
        Scanner str=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        String a=str.next();
        String a1="Economy";
        String a2="Business";
        String a3="First";
        int b=s.nextInt();
        double c=s1.nextDouble();
        String d=str.next();
        String d1="Domestic";
        String d2="International-Short";
        String d3="International-Long";
        
        System.out.println("Booking Class: "+a);
        System.out.println("Days Until Departure: "+b);
        System.out.println("Seat Availability: "+c+"%");
        System.out.println("Route Type: "+d);

        double bs=0.0;
        if(a.equals(a1)){
            if(d.equals(d1)){
                bs=200.0;
            }else if(d.equals(d2)){
                bs=500.0;
            }else if(d.equals(d3)){
                bs=800.0;
            }
        }else if(a.equals(a2)){
            if(d.equals(d1)){
                bs=600.0;
            }else if(d.equals(d2)){
                bs=1500.0;
            }else if(d.equals(d3)){
                bs=2500.0;
            }
        }else if(a.equals(a3)){
            if(d.equals(d1)){
                bs=1000.0;
            }else if(d.equals(d2)){
                bs=3000.0;
            }else if(d.equals(d3)){
                bs=5000.0;
            }
        }
        double dm=0.0;
        if(c<30 && b<14){
            dm=1.8;
        }else if(c>=30 && c<=40){
            dm=1.3;
        }else if(c<50 && b>30){
            dm=1.5;
        }else if(c<60 || (b>=30 && b<=60)){
            dm=1.0;
        }else if(c>=60 && b>60){
            dm=0.8;
        }
        
        double fprice=bs*dm;
        System.out.println("Base Price: $"+bs);
        System.out.println("Demand Multiplier: "+dm+"x");
        System.out.println("Final Ticket Price: $"+fprice);
        if(dm==1.8){
            System.out.println("Pricing Category: High Demand");
        }else if(dm==1.5){
            System.out.println("Pricing Category: High Demand");
        }else if(dm==1.0 || dm==1.3){
            System.out.println("Pricing Category: Moderate");
        }else if(dm==0.8){
            System.out.println("Pricing Category: Low Demand");
        }
    }
}