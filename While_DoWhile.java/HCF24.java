import java.util.Scanner;
public class HCF24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("HCF of "+a+" and "+b+" = ");
        int sum=0;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.println(a);
    }
}