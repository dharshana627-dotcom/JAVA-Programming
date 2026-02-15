import java.util.Scanner;
public class B20{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int ar=s.nextInt();
        int si=s.nextInt();
        int ai=s.nextInt();
        int t=s.nextInt();
        int pc=s.nextInt();
        int res=ar+si+ai-t-pc;
        System.out.println("Publishing Profit = "+res);
    }
}