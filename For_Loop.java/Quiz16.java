import java.util.Scanner;
public class Quiz16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n= sc.nextInt();
        int passCount = 0;
        int failCount = 0;
        int high = 0;
        int totalScore = 0;
        int score;
        String res;

        for(int i = 1; i <= n;i++){
            String stuName = sc.next();
            int crtans = sc.nextInt();
            int wrgans = sc.nextInt();
            int unattempted = sc.nextInt();
            sc.nextLine();
            score = (crtans*4)-(wrgans*3)+(unattempted*0);
            high = Math.max(high, score);
            totalScore += score;

            System.out.println("Student:"+stuName);
            System.out.println("Correct:"+crtans);
            System.out.println("Wrong:"+wrgans);
            System.out.println("Unattempted:"+unattempted);
            System.out.println("Score:"+score);
            if(score >= 32){
                System.out.println("Result : Pass");
                passCount++;
            }
            else{
                System.out.println("Result : Fail");
                failCount++;
            }
            System.out.println("\n");
        } 
        double avg = (double)totalScore/n;
    
        System.out.println("Total Students:"+n);
        System.out.println("Pass Count:"+passCount);
        System.out.println("Fail Count:"+failCount);
        System.out.println("Class Average:"+avg);
        System.out.println("Highest Score:"+high);
    }
}