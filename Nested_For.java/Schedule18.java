import java.util.*;
public class Schedule18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String arr[][]=new String[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.next();
            }
        }
        String name[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Class Time Table:");
        System.out.print("Day ");
        for(int i=1;i<=c;i++){
            System.out.print("Period"+i+" ");
        }
        System.out.println();
        for(int i=0;i<r;i++){
            System.out.print(name[i]+" ");
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}