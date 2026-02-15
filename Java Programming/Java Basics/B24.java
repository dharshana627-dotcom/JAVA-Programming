import java.util.Scanner;
public class B24{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tr=s.nextInt();
        int br=s.nextInt();
        int ss=s.nextInt();
        int pm=s.nextInt();
        int sr=s.nextInt();
        int ac=s.nextInt();
        int res=tr+br+ss-pm-sr-ac;
        System.out.println("Remaining Tournament Fund = "+res);
    }
}