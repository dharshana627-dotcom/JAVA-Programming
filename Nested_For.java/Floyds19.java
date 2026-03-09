import java.util.*;
public class Floyds19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int k=1;
        System.out.println("Floyd's Triangle:");
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k+1;
            }
            System.out.print("\n");
        }
    }
}