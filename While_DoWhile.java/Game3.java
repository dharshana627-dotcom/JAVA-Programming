import java.util.Scanner;
public class Game3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); 
        int count = 0;

        while(true){
            System.out.print("Guess the number(1100): ");
            int n1 = sc.nextInt();
            count++;
            if(n<n1){
                System.out.println("Too high!");
            }else if(n>n1){
                System.out.println("Too Low!");
            }else if(n==n1){
                System.out.println("Correct! Attempts: "+count);
                break;
            }
        }
    }
}