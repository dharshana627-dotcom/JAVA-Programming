import java.util.Scanner;
public class B19{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //rentalDays
        int b=s.nextInt();  //rentPerDay
        int c=s.nextInt();  //lateCharges
        int d=s.nextInt();  //fuelCost
        int e=s.nextInt();  //maintenanceCost
        int res=(a*b)+c-d-e;
        System.out.println("Net Profit = "+res);
    }
}