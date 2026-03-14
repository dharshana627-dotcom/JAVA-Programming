import java.util.*;
public class Pascals11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Pascal's Triangle:");
         for (int i=0;i<n;i++) {
            int num=1;
            for (int j=0;j<=i;j++) {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.print("\n");
        }
    }
}