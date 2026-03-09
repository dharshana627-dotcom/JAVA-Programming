import java.util.*;
public class RightTri3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        String c=sc.next();
        System.out.println("Right Triangle Pattern:");
        if(c.equals("star")){
            for(int i=1;i<=r;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }else if(c.equals("number")){
            for(int i=1;i<=r;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                System.out.print("\n");
            }
        }
    }
}