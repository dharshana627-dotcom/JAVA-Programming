import java.util.*;
public class Weather5{
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
        System.out.println("Temperature Grid:");
        int max=arr[0][0],min=arr[0][0],p1=0,p2=0,p3=0,p4=0,sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
                if(arr[i][j]>max){
                    max=arr[i][j];
                    p1=i;
                    p2=j;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    p3=i;
                    p4=j;
                }
            }
            System.out.println();
        }
        double avg=(sum*100.0)/(r*c);
        System.out.println("Maximum Temperature: "+max+" C at position ("+p1+","+p2+")");
        System.out.println("Minimum Temperature: "+min+" C at position ("+p3+","+p4+")");
        System.out.printf("Average Temperature: %.0f C",avg);
    }
}