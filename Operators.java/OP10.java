import java.util.Scanner;
public class OP10{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //unitsConsumed
        int b=s.nextInt();  //voltageFluctuation

        if(a>500 || b==1){
            System.out.println("Alter");
        }else{
            System.out.println("Normal");
            
        }
    }
}