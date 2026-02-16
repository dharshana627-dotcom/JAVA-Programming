import java.util.Scanner;
public class B14{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //baseSalary
        int b=s.nextInt();  //sessions
        int c=s.nextInt();  //payPerSession
        int d=s.nextInt();  //bonus
        int e=s.nextInt();  //maintenanceFee
        int res=a+(b*c)+d-e;
        System.out.println("Final Salary = "+res);
    }
}