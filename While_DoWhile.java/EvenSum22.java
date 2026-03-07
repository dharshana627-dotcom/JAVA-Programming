import java.util.Scanner;
public class EvenSum22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("Sum of even numbers from "+n1+" to "+n2+": ");
        int sum=0;
        while(n1<=n2){
            if(n1%2==0){
                sum+=n1;
            }
            n1++;
        }
        System.out.print(sum);
    }
}