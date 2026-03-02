import java.util.Scanner;
public class University{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String a1="Full-Time";
        String a2="Part-Time";
        String a3="Continuing-Education";
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();
        String c1="Undergraduate";
        String c2="Graduate";
        String c3="Professional";
        // sc.nextLine();
        String d = sc.nextLine();
        String d1="In-State";
        String d2="Out-of-State";
        String d3="International";

        double tuition=0.0;
        if(c.equals(c1)){
            tuition=350;
        }else if(c.equals(c2)){
            tuition=550;
        }else if(c.equals(c3)){
            tuition=800;
        }
        double rm=0.0;
        if(d.equals(d1)){
            rm=1.0;
        }else if(d.equals(d2)){
            rm=2.5;
        }else if(d.equals(d3)){
            rm=3.0;
        }
        double pf=0.0;
        double acti=0.0;
        if(a.equals(a1)){
            acti=200;
            if(c.equals(c1)){
                pf=500;
            }else if(c.equals(c2)){
                pf=750;
            }else if(c.equals(c3)){
                pf=1200;
            }
        }else if(a.equals(a2)){
            acti=100;
            if(c.equals(c1)){
                pf=300;
            }else if(c.equals(c2)){
                pf=750;
            }else if(c.equals(c3)){
                pf=900;
            }
        }else if(a.equals(a3)){
            acti=50;
            pf=150;
        }
        double tc=b*tuition*rm;
        double total=tc+pf+acti;
        String cat="";
        if(a.equals(a1) && d.equals(d1)){
            cat="Standard";
        }else if(a.equals(a3)){
            cat="Reduced";
        }else if(d.equals(d2) || d.equals(d3)){
            cat="Premium";
        }

        System.out.println("Student Status: "+a);
        System.out.println("Credit Hours: "+b);
        System.out.println("Program Type: "+c);
        System.out.println("Residency: "+d);
        System.out.println("Base Tuition Per Credit: $"+tuition);
        System.out.println("Residency Multiplier: "+rm+"x");
        System.out.println("Program Fee: $"+pf);
        System.out.println("Student Activity Fee: $"+acti);
        System.out.println("Total Registration Fee: $"+total);
        System.out.println("Fee Category: "+cat);
    }
}