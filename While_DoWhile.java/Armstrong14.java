import java.util.Scanner;
public class Armstrong14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n);
        int temp=n,sum=0;

        while(n!=0){
            int dig=n%10;
            int res=1;
            for(int i=0;i<3;i++){
                res=res*dig;
            }
            sum=sum+res;
            n=n/10;
        }
        if(sum==temp){
            System.out.println(" is an Armstrong number");
        }else{
            System.out.println(" is not an Armstrong number");
        }
    }
}