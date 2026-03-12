import java.util.*;
public class Fitness19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int max=arr[0],total=0,index=0,count=0;
        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                index=i+1;
            }
            if(arr[i]<target){
                count++;
            }
        }
        double avg=(double)total/n;
        double per=(double)((n-count)/n)*100.0;
        System.out.println("Days Tracked: "+n);
        System.out.println("Total Calories Burned: "+total);
        System.out.printf("Average Daily Burn: %.2f\n",avg);
        System.out.println("Peak Burn Day: Day "+index+" ("+max+" calories)");
        System.out.println("Days Below Target: "+count);
        System.out.printf("Goal Achievement: %.2f%%",per);
    }
}