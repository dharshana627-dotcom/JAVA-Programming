import java.util.*;
public class ELearning20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0],total=0,index1=0,index2=0,count=0;
        for (int i=0;i<n;i++) {
            total+=arr[i];
            if (arr[i]>max) {
                max = arr[i];
                index1=i+1;
            }
            if (arr[i]<min) {
                min = arr[i];
                index2=i+1;
            }
            if(arr[i]<60){
                count++;
            }
        }
        double avg=(double)total/n;
        double per=((double)(n-count)/n)*100.0;
        System.out.println("Total Students: "+n);
        System.out.printf("Average Completion: %.2f%%\n",avg);
        System.out.println("Highest Completion: "+max+"% (Student "+index1+")");
        System.out.println("Lowest Completion: "+min+"% (Student "+index2+")");
        System.out.println("At-Risk Students (<60%): "+count);
        System.out.printf("Success Rate: %.2f%%",per);
    }
}