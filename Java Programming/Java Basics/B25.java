import java.util.Scanner;
public class B25{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int ru=s.nextInt();
        int rr=s.nextInt();
        int cu=s.nextInt();
        int cr=s.nextInt();
        int cf=s.nextInt();
        int pc=s.nextInt();
        int res=ru+rr+cu-cr-cf-pc;
        System.out.println("Net Water Revenue = "+res);
    }
}