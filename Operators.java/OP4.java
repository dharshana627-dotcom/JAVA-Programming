import java.util.Scanner;
public class OP4{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //creditLimit
        int b=s.nextInt();  //purchaseAmount
        int c=s.nextInt();  //cardBlocked

        if(a>=b && c==0){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
            
        }
    }
}