import java.util.*;
public class SchEli{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Scanner str=new Scanner(System.in);

        double a=s.nextDouble();
        double b=s.nextDouble();
        int c=s1.nextInt();
        String d=str.next();
        String d1="Merit";
        String d2="Need-Based";
        String d3="Sports";

        System.out.println("GPA: "+a);
        System.out.println("Family Income: $"+b);
        System.out.println("Extracurricular Score: "+c);
        System.out.println("Scholarship Type: "+d);

        if(a>=0.0 && a<=4.0){
            if(a>=3.0){
                System.out.println("Eligibility: Eligible");
            }
            else{
                System.out.println("Eligibility: Not Eligible");
            }
            if(d.equals(d1)){
                if(a>=3.8 && c>=80){
                    System.out.println("Award Amount: $25000.0");
                    System.out.println("Award Category: Full");
                }
                else if(a>=3.5 && c>=70){
                    System.out.println("Award Amount: $15000.0");
                    System.out.println("Award Category: Partial");
                }
                else if(a>=3.0 && c>=60){
                    System.out.println("Award Amount: $8000.0");
                    System.out.println("Award Category: Minimal");
                }
            }else if(d.equals(d2)){
                if(b<=30000 && a>=3.5){
                    System.out.println("Award Amount: $30000.0");
                    System.out.println("Award Category: Full");
                }
                else if(b<=50000 && a>=3.0){
                    System.out.println("Award Amount: $18000.0");
                    System.out.println("Award Category: Partial");
                }
                else if(b<=70000 && a>=2.8){
                    System.out.println("Award Amount: $10000.0");
                    System.out.println("Award Category: Minimal");
                }
            }else if(d.equals(d3)){
                if(c>=85 && a>=3.0){
                    System.out.println("Award Amount: $22000.0");
                    System.out.println("Award Category: Full");
                }
                else if(c>=75 && a>=2.8){
                    System.out.println("Award Amount: $20000.0");
                    System.out.println("Award Category: Partial");
                }
                else if(c>=65 && a>=2.5){
                    System.out.println("Award Amount: $12000.0");
                    System.out.println("Award Category: Minimal");
                }
            }else if(a<3.0){
                System.out.println("Award Amount: $0.0");
                System.out.println("Award Category: None");
            }
        }
    }
}