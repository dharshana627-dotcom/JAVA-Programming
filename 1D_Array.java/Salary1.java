import java.util.*;
public class Salary1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        double avg=0.0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
            avg+=arr[i]/n;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>avg){
                count++;
            }
        }
        double per=(count*100.0)/n;

        System.out.println("Total Employees: "+n);
        System.out.printf("Average Salary: %.2f",avg);
        System.out.println("\nEmployees Above Average: "+count);
        System.out.printf("Percentage: %.2f%%",per);
    }
}