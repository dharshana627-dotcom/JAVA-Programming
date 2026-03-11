import java.util.*;
public class Portfolio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double qty[] = new double[n];
        double price[] = new double[n];
        double value[] = new double[n];

        for (int i=0;i<n;i++) {
            qty[i]=sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            price[i]=sc.nextDouble();
        }
        double sum=0;
        for (int i=0;i<n;i++) {
            value[i]=qty[i]*price[i];
            sum+=value[i];
        }
        double max=value[0],min=value[0];
        int maxIndex=1,minIndex=1;

        for (int i=0;i<n;i++) {
            if (value[i]>max) {
                max = value[i];
                maxIndex = i;
            }
            if (value[i]<min) {
                min=value[i];
                minIndex = i;
            }
        }
        System.out.println("Number of Assets: "+n);
        System.out.printf("Total Portfolio Value: $%.2f\n",sum);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n",maxIndex,max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)",minIndex,min);
    }
}