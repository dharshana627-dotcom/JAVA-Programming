import java.util.Scanner;
public class B21{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int mc=s.nextInt();
        int pf=s.nextInt();
        int hb=s.nextInt();
        int ss=s.nextInt();
        int eb=s.nextInt();
        int cc=s.nextInt();
        int res=mc+pf+hb-ss-eb-cc;
        System.out.println("Publishing Profit = "+res);
    }
}