import java.util.Scanner;
public class Fitness9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tdue = 0;
        int tcal = 0;

        for (int i = 1; i <= n; i++) {
            String type = sc.next();
            int min = sc.nextInt();

            int rate = 0;
            String intensity = "";

            switch (type) {
                case "Running": 
                    rate = 10; 
                    intensity = "High"; 
                    break;
                case "Swimming": 
                    rate = 12; 
                    intensity = "High"; 
                    break;
                case "Cycling": 
                    rate = 8; 
                    intensity = "Moderate"; 
                    break;
                case "Gym": 
                    rate = 7; 
                    intensity = "Moderate"; 
                    break;
                case "Walking": 
                    rate = 4; 
                    intensity = "Low"; 
                    break;
            }

            int cal = rate * min;

            tdue += min;
            tcal += cal;

            System.out.println("Session " + i + ": " + type);
            System.out.println("Duration: " + min + " minutes");
            System.out.println("Calories Burned: " + cal);
            System.out.println("Intensity: " + intensity);
            System.out.println("\n");
        }

        double avg = tcal / (double) n;

        String level="";
        if (tcal < 300) 
            level = "Beginner";
        else if (tcal >= 300 && tcal <= 1000) 
            level = "Intermediate";
        else if(tcal > 1000)
            level = "Advanced";

        System.out.println("Total Workouts: " + n);
        System.out.println("Total Duration: " + tdue + " minutes");
        System.out.println("Total Calories Burned: " + tcal);
        System.out.println("Average Calories per Session: " + avg);
        System.out.println("Fitness Level: " + level);
    }
}