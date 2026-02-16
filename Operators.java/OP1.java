import java.util.Scanner;
public class OP1{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int avg=(a+b)/2;
        if(a>=50 && b>=50 && avg>=60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            
        }
    }
}