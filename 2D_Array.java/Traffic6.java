import java.util.*;
public class Traffic6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0;i<r;i++) {
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Traffic Data:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nTotal Traffic Per Lane:");
        int max=0,index=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
            System.out.println("Lane "+(i+1)+": "+sum);
        }
        for(int j=0;j<c;j++){
            int sum=0;
            for(int i=0;i<r;i++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                index=j+1;
            }
        }
        System.out.println("Busiest Hour: Hour "+index+" with "+max+" vehicles");
    }
}