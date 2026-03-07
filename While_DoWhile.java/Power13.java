import java.util.Scanner;
public class Power13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base=sc.nextInt();
        int expo=sc.nextInt();
        System.out.print(base+"^"+expo+" = ");
        int res=1;
        while(expo>0){
            res=res*base;
            expo--;
        }
        System.out.print(res);
    }
}