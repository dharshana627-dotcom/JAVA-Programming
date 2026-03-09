import java.util.*;
public class Calendar5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int mid=r/2;
        System.out.println("Diamond Pattern:");
        for(int i=0;i<=mid;i++){
            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
            for(int j=1;j<=mid-i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i=mid-1;i>=0;i--){
            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
            for(int j=1;j<=mid-i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}