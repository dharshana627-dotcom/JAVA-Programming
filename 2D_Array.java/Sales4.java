import java.util.*;
public class Sales4{
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
        System.out.println("Sales Data:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nProduct-wise Total Sales:");
        int max=0,index=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
            System.out.println("Product "+(i+1)+": "+sum);
            if(sum>max){
                max=sum;
                index=i+1;
            }
        }
        System.out.println("Best-Selling Product: Product "+index+" with "+max+" units");
    }
}