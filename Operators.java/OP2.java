import java.util.Scanner;
public class OP2{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //accountBalance
        int b=s.nextInt();  //withdrawalAmount
        int c=s.nextInt();  //dailyLimit
        
        if(a>=b && c>=b){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
            
        }
    }
}