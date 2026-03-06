import java.util.Scanner;
public class Sum2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0; 
        int count = 0;
        int n;

        while(true){
            System.out.print("Enter number (0 to stop):");
            n = sc.nextInt();

            if(n == 0){
                break;
            }
            sum += n;
            count++;
        }
        System.out.println("Enter number(0 to stop): "+n);
        System.out.println("Total sum: "+sum);        
        System.out.println("Count: "+count);
    }
}