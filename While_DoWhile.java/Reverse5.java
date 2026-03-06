import java.util.Scanner;
public class Reverse5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        System.out.println("Original: "+n);
        int rev=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        System.out.println("Reversed: "+rev);
    }
}