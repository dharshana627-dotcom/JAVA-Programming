import java.util.Scanner;
public class OP12{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //fileSize
        int b=s.nextInt();  //compressionCycles
        int res=a>>b;
        System.out.println("Compressed Size = "+res);
    }
}