import java.util.Scanner;
public class B22{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        int cp=s.nextInt();
        int ec=s.nextInt();
        int dc=s.nextInt();
        int disc=s.nextInt();
        int me=s.nextInt();
        int res=(c*cp)+ec+dc-disc-me;
        System.out.println("Publishing Profit = "+res);
    }
}