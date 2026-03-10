import java.util.*;
public class StockLevel2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr[]=new int[n1];
        int index[]=new int[n1];
        int count=0,res=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<n2){
                index[count] = i;
                count++;
            }
        }
        System.out.println("Total Products: "+n1);
        System.out.println("Minimum Threshold: "+n2);
        System.out.println("Low Stock Products: "+count);
        System.out.print("Product Indices: [");
        for (int i=0;i<count;i++) {
            System.out.print(index[i]);
            if (i<count-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}