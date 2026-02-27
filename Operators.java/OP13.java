import java.util.Scanner;
public class OP13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a & b)==0){
            System.out.println("Inactive");
        }
        else{
            System.out.println("Active");
        }
    }
}