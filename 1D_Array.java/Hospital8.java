import java.util.*;
public class Hospital8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int index[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],sum=0,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>60){
                count++;
            }
            sum+=arr[i];
        }
        double avg=sum/n;
        double per=((double)(n-count)/n)*100.0;
        System.out.println("Total Patients: "+n);
        System.out.println("Longest Wait Time: "+max+" minutes");
        System.out.printf("Average Wait Time: %.2f minutes\n",avg);
        System.out.println("Patients Waiting >60 min: "+count);
        System.out.printf("Service Level: %.2f%%",per);
    }
}