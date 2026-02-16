import java.util.Scanner;
public class OP7{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //cartValue
        int b=s.nextInt();  //premiumMember

        if(a>999 || b==1){
            System.out.println("Free Shipping");
        }else{
            System.out.println("Charges Applied");
            
        }
    }
}