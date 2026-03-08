import java.util.Scanner;
public class Strong20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n);
        int temp=n;
        int sum=0;
        while(temp!=0){
            int dig=temp%10;
            int fact=1;
            for(int i=1;i<=dig;i++){
                fact*=i;
            }
            sum+=fact;
            temp=temp/10;
        }
        if(n==sum){
            System.out.println(" is a strong number");
        }else{
            System.out.println(" is not a strong number");
        }
    }
}