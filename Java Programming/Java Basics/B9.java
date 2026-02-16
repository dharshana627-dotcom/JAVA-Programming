import java.util.Scanner;
public class B9{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //roomChargePerDay
        int b=s.nextInt();  //days
        int c=s.nextInt();  //medicineCost
        int d=s.nextInt();  //labFees
        int e=s.nextInt();  //insuranceCoverage
        int res=(a*b)+c+d-e;
        System.out.println("Payable Amount = "+res);
    }
}