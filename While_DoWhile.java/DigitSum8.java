import java.util.Scanner;
public class DigitSum8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        System.out.println("Number: "+n);
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}