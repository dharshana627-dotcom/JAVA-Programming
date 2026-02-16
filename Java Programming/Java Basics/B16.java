import java.util.Scanner;
public class B16{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //generalPassengers
        int b=s.nextInt();  //generalFare
        int c=s.nextInt();  //acPassengers
        int d=s.nextInt();  //acFare
        int e=s.nextInt();  //platformCollection
        int f=s.nextInt();  //maintenanceCost
        int g=s.nextInt();  //fuelCost
        int res=(a*b)+(c*d)+e-f-g;
        System.out.println("Net Railway Revenue = "+res);
    }
}