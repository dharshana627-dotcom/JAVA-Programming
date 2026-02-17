import java.util.Scanner;
public class B6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double res=a/b;
        double res1=res*c;
        double res2=res1+d;
        System.out.println("Total Trip Cost = "+res2);
    }
}