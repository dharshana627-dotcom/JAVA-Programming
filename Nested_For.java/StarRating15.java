import java.util.*;
public class StarRating15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String pro[]=new String[n];
        double rate[]=new double[n];
        double sum=0;
        for (int i=0;i<n;i++) {
            pro[i]=sc.next();
            rate[i]=sc.nextDouble();
            sum+=rate[i];
        }
        System.out.println("Star Rating Matrix:");
        System.out.println("Product Rating Stars");
        for(int i=0;i<n;i++){
            System.out.print(pro[i]+" "+rate[i]+" ");
            int full=(int)rate[i];
            for(int j=0;j<full;j++){
                System.out.print("★");
            }
            for(int j=full;j<5;j++){
                System.out.print("☆");
            }
            System.out.println();
        }
        double avg=(double)sum/n;
        System.out.printf("Average Rating: %.2f\n",avg);
    }
}