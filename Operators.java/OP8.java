import java.util.Scanner;
public class OP8{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //age
        int b=s.nextInt();  //idProof

        if(a>=18 && b==1){
            System.out.println("Allowed");
        }else{
            System.out.println("Denied");
            
        }
    }
}