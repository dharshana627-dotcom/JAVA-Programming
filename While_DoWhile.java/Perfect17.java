import java.util.Scanner;
import java.lang.*;
public class Perfect17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n);
        int i=1,sum=0;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==n){
            System.out.println(" is a perfect number");
        }else{
            System.out.println(" is not a perfect number");
        }
    }
}