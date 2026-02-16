import java.util.Scanner;
public class OP5{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //salary
        int b=s.nextInt();  //creditScore

        if(a>25000 && b>700){
            System.out.println("Approved");
        }else{
            System.out.println("Rejected");
            
        }
    }
}