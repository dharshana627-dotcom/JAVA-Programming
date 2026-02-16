import java.util.Scanner;
public class OP3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //workingHours
        int b=s.nextInt();  //attendancePercentage

        if(a>40 && b>90){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
            
        }
    }
}