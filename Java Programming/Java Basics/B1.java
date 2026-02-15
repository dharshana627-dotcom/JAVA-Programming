import java.util.Scanner;
public class B1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        int sum=a+b+c-d-e;
        System.out.println("Take Home Salary = "+sum);
    }
} 