import java.util.Scanner;
public class Vehicle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        String b1="Sedan";
        String b2="SUV";
        String b3="Sports";
        String b4="Truck";
        String c = sc.nextLine();
        String c1="Clean";
        String c2="Minor-Violations";
        String c3="Major-Violations";
        String d = sc.nextLine();
        String d1="Basic";
        String d2="Standard";
        String d3="Comprehensive";

        double bp=0.0;
        if(d.equals(d1)){
            bp=500;
        }else if(d.equals(d2)){
            bp=800;
        }else if(d.equals(d3)){
            bp=1500;
        }
        double age=0.0;
        String rc="";
        if(a>=16 && a<=21){
            age=1.8;
            rc="Very High";
        }else if(a>=22 && a<=25){
            age=1.5;
            rc="High";
        }else if(a>=26 && a<=40){
            age=1.0;
            rc="Low";
        }else if(a>=41 && a<=60){
            age=0.9;
            rc="Low";
        }else if(a>=61){
            age=1.1;
            rc="Medium";
        }
        double risk=0.0;
        if(b.equals(b1)){
            risk=1.0;
        }else if(b.equals(b2)){
            risk=1.2;
        }else if(b.equals(b3)){
            risk=1.5;
        }else if(b.equals(b4)){
            risk=1.1;
        }
        int adj=0;
        if(c.equals(c1)){
            adj=-10;
        }else if(c.equals(c2)){
            adj=25;
        }else if(c.equals(c3)){
            adj=50;
        }
        double adjpre=bp*age*risk;
        double fpre=adjpre*(1+adj/100);
        double mpre=fpre/12;
        double apre=mpre*12;

        System.out.println("Driver Age: "+a);
        System.out.println("Vehicle Type: "+b);
        System.out.println("Driving Record: "+c);
        System.out.println("Coverage Level: "+d);
        System.out.println("Base Premium: $"+bp);
        System.out.println("Age Factor: "+age+"x");
        System.out.println("Vehicle Risk Factor: "+risk+"x");
        System.out.println("Record Adjustment: "+adj+"%");
        System.out.println("Monthly Premium: $"+mpre);
        System.out.println("Annual Premium: $"+apre);
        System.out.println("Risk Category: "+rc);

    }

}

