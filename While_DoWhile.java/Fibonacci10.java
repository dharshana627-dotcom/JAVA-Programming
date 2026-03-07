import java.util.Scanner;
public class Fibonacci10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1; 
        int i=1;
        System.out.println("Fibonacci sequence "+n+" terms):");
        while(i<=n){
            System.out.print(first+" ");
            int temp=first+second;
            first=second;
            second=temp;
            i++;
        }
    }
}