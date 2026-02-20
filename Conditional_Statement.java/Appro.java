import java.util.*;
public class Appro{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        
        int a=s.nextInt();
        double b=s1.nextDouble();
        double c=s1.nextDouble();
        String t=str.next();
        String t1="Personal";
        String t2="Home";
        String t3="Business";
        
        System.out.println("Credit Score:"+a);
        System.out.println("Annual Income:$"+b);
        System.out.println("Debt-to-Income Ratio:"+c+"%");
        System.out.println("Loan Type:"+t);
        
        if(a>=300 && a<=850){
            if(t.equals(t2)){
                if(a>=750 && c<=30){
                    System.out.println("Decision:Approved");
                    System.out.println("Maximum Loan Amount:$"+4*b);
                }
                else if((a>=700 && a<=749) && (c>=31 && c<=40)){
                    System.out.println("Decision:Needs Review");
                    System.out.println("Maximum Loan Amount:$"+3*b);
                }
            }
            if(t.equals(t1)){
                if(a>=750 && c<=30){
                    System.out.println("Decision:Approved");
                    System.out.println("Maximum Loan Amount:$"+1*b);
                }
                else if((a>=650 && a<=699)&& (c>=31 && c<=40)){
                    System.out.println("Decision:Needs Review");
                    System.out.println("Maximum Loan Amount:$"+0.5*b);
                }
            }
            if(t.equals(t3)){
                if((a>=750 || (a>=700 && a<=749)) && (c<=30 || (c>=31 && c>=40))){
                    System.out.println("Decision:Approved");
                    System.out.println("Maximum Loan Amount:$"+3*b);
                }
            }
            if(a<600 || c>50){
                System.out.println("Decision:Rejected");
                System.out.println("Maximum Loan Amount:$0.0");
            }
        }
    }
}