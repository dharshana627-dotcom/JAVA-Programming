import java.util.*;
public class Grade3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int fail=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int high=arr[0],low=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>high){
                high=arr[i];
            }
            if(arr[i]<low){
                low=arr[i];
            }
            if(arr[i]<40){
                fail++;
            }
        }
        int pass=n-fail;
        double per=(pass*100.0)/n;

        System.out.println("Total Students: "+n);
        System.out.println("Highest Score: "+high);
        System.out.println("Lowest Score: "+low);
        System.out.println("Failed Students: "+fail);
        System.out.printf("Pass Percentage: %.2f%%",per);
    }
}