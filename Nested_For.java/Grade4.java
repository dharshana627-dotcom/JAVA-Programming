import java.util.*;
public class Grade4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Grade Sheet:");
        System.out.print("Student ");
        for(int i=1;i<=c;i++){
            System.out.print("Sub"+i+" ");
        }
        System.out.println("Average");
        for(int i=0;i<r;i++){
            String name=sc.next();
            int marks[]=new int[c];
            int sum=0;
            System.out.print(name+" ");
            for(int j=0;j<c;j++){
                marks[j]=sc.nextInt();
                sum+=marks[j];
                System.out.print(marks[j]+" ");
            }
            double avg=(double)sum/c;
            System.out.printf("%.2f\n",avg);
        }
    }
}