import java.util.Scanner;
public class B11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //distance
        int b=s.nextInt();  //ratePerKm
        int c=s.nextInt();  //maintenance
        int d=s.nextInt();  //driverAllo
        int e=s.nextInt();  //subsidy
        int res=(a*b)+c+d-e;
        System.out.println("Total Transport Fee = "+res);
    }
}