import java.util.Scanner;
public class Table21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Multiplication table of "+n1+": ");
        int i=1;
        do{
            int mul=n1*i;
            System.out.println(n1+" x "+i+" = "+mul);
            i++;
        }while(i<=n2);
    }
}