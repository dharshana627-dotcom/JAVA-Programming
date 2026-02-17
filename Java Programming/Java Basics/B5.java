import java.util.Scanner;
public class B5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        int d=sc.nextInt();
        double res=a*(b/100);
        double res1=a+res;
        double res2=res1*(c/100);
        double res3=res1+res2;
        double res4=res3/d;
        System.out.println("Amount Per Person = "+res4);
    }
}