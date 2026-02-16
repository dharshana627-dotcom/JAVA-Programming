import java.util.Scanner;
public class B10{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //deliveries
        int b=s.nextInt();  //payoutPerDeliver
        int c=s.nextInt();  //incentive
        int d=s.nextInt();  //fuelCost
        int res=(a*b)+c-d;
        System.out.println("Driver Earnings = "+res);
    }
}