import java.util.Scanner;
public class DB19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Decimal: "+n);
        int rev=0,p=1;
        while(n>0){
            int dig=n%2;
            rev=rev+(dig*p);
            p=p*10;
            n=n/2;
        }
        System.out.println("Binary: "+rev);
    }
}