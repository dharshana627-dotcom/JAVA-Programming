import java.util.*;
public class Warehouse7{
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
        System.out.println("Inventory Grid:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0,max=arr[0][0],p1=0,p2=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
                if(arr[i][j]>max){
                    max=arr[i][j];
                    p1=i;
                    p2=j;
                }
            }
        }
        int avg=(sum*100)/(r*c);
        System.out.println("Total Inventory: "+sum);
        System.out.println("Max Stock Zone: Row "+p1+", Col "+p2+" ("+max+" units)");
        System.out.println("Average Stock per Zone: "+avg);
    }
}