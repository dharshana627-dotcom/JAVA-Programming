import java.util.Scanner;
public class B7{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int res=(a*b)+c-d;
        System.out.println("Final Weekly Wage = "+res);
    }
}