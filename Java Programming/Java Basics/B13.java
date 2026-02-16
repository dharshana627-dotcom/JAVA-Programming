import java.util.Scanner;
public class B13{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //yieldPerAcre
        int b=s.nextInt();  //acres
        int c=s.nextInt();  //extraYield
        int d=s.nextInt();  //damagedCrops
        int res=(a*b)+c-d;
        System.out.println("Marketable Yield = "+res);
    }
}