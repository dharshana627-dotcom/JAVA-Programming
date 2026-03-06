import java.util.Scanner;
public class Factorial4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        int fact=1;
        int i=1,sum=0;
        while(i<=n){
            fact*=i;
            i++;
        }
        sum+=fact;
        System.out.println("Factorial of "+n+" = "+sum);
    }
}