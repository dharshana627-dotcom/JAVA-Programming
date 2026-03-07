import java.util.Scanner;
public class LCM18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a=n1,b=n2;
        System.out.print("LCM of "+n1+" and "+n2+" = ");
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }else if(n2>n1){
                n2=n2-n1;
            }
        }
        int lcm=(a*b)/n1;
        System.out.println(lcm);
    }
}