import java.util.Scanner;
public class B17{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //developerHours
        int b=s.nextInt();  //hourlyRate
        int c=s.nextInt();  //designCost
        int d=s.nextInt();  //testingCost
        int e=s.nextInt();  //advancePaid
        int res=(a*b)+c+d-e;
        System.out.println("Final Project Cost = "+res);
    }
}