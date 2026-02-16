import java.util.Scanner;
public class B15{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //roomBooked
        int b=s.nextInt();  //pricePerRoom
        int c=s.nextInt();  //serviceCharges
        int d=s.nextInt();  //commission
        int res=(a*b)+c-d;
        System.out.println("Total Revenue = "+res);
    }
}