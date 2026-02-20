import java.util.Scanner;
public class Perf {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        System.out.print("Rating: ");
        int r=s.nextInt();
        System.out.print("Years of Service: ");
        int ser=s.nextInt();
        System.out.print("Department Type: ");
        String t=str.next();
        String t1="Critical";
        String t2="Non-Critical";
        System.out.print("Base Salary: ");
        double bs=s1.nextDouble();
        if(r<0 || r>5){
            System.out.println("Invalid");
        }
        System.out.println("Perfeormance Rating: "+r);
        System.out.println("Years of Service: "+ser);
        System.out.println("Department: "+t);
        if(r>=3 && r<=5){
            double per;
            double bonus;
            if(t.equals(t1)){
                if(r==5 && ser>=5){
                    per=25;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(r==4 && ser>=10){
                    per=22;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(r==4 && ser<5){
                    per=15;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(r==3 && ser<10){
                    per=10;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else{
                    per=0;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
            }
            if(t.equals(t2)){
                if(r==5){
                    per=18;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(r==4){
                    per=12;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else if(r==3){
                    per=8;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
                else{
                    per=0;
                    System.out.println("Bonus Percentage: "+(int)per+"%");
                    bonus=bs*(per/100);
                    System.out.println("Bonus Amount: $"+bonus);
                }
            }
            System.out.println("Status: Eligible");
        }
        else{
            System.out.println("Status: Not Eligible");
        }
    }
}