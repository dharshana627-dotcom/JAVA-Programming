import java.util.Scanner;
public class GCD11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("GCD of "+n1+" and "+n2+" = ");

        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }else if(n2>n1){
                n2=n2-n1;
            }
        }
        System.out.print(n1);
    }
}