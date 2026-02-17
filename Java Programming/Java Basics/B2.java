import java.util.Scanner;
public class B2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double a=s.nextInt();  
        double b=s.nextInt();  
        double c=s.nextInt();  
        double d=s.nextInt();  
        double res=a+(b*c);
        double res1=res+(res*d/100);
        System.out.println("Remaining Fund = "+res1);
        
    } 
}