import java.util.Scanner;
public class B8{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //rodsPerHour
        int b=s.nextInt();  //hoursWorked
        int c=s.nextInt();  //overtimeRods
        int d=s.nextInt();  //rejectedRods
        int res=(a*b)+c-d;
        System.out.println("Usable Rods = "+res);
    }
}
