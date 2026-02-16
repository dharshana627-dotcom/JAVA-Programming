import java.util.Scanner;
public class OP6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //familyIncome
        int b=s.nextInt();  //percentage

        if(a<200000 && b>=75){
            System.out.println("Granted");
        }else{
            System.out.println("Not Granted");
            
        }
    }
}