import java.util.Scanner;
public class BD16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Binary: "+n);
        int rev=0,p=1;
        while(n>0){
            int dig=n%2;
            rev=rev+(dig*p);
            p=p*2;
            n=n/10;
        }
        System.out.println("Decimal: "+rev);
    }
}