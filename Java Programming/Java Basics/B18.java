import java.util.Scanner;
public class B18{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();  //registrationCollection
        int b=s.nextInt();  //sponsorshipAmount
        int c=s.nextInt();  //stallRent
        int d=s.nextInt();  //stageCost
        int e=s.nextInt();  //celebrityCost
        int f=s.nextInt();  //marketingCost
        int res=a+b+c-d-e-f;
        System.out.println("Remaining Fund = "+res);
    }
}