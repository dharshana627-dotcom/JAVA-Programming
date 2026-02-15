import java.util.Scanner;
public class B23{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        int rp=s.nextInt();
        int pc=s.nextInt();
        int inf=s.nextInt();
        int hc=s.nextInt();
        int fs=s.nextInt();
        int res=(w*rp)+pc+inf-hc-fs;
        System.out.println("Cargo Revenue = "+res);
    }
}