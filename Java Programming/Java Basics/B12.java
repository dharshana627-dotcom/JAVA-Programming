import java.util.Scanner;
public class B12{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //ticketRevenue
        int b=s.nextInt();  //snackRevenue
        int c=s.nextInt();  //maintenanceCost
        int d=s.nextInt();  //electricityBill
        int res=a+b-c-d;
        System.out.println("Net Profit = "+res);
    }
}