import java.util.Scanner;
public class OP11{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //baseBoxes
        int b=s.nextInt();  //levels
        int res=a<<b;
        System.out.println("Total Capacity = "+res);
            
    }
}