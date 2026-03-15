import java.util.*;
public class Chess12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Chess Board Pattern:");
         for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if((i+j)%2==0){
                    System.out.print("■ ");
                }
                if((i+j)%2==1){
                    System.out.print("□ ");
                }
            }
            System.out.print("\n");
        }
    }
}