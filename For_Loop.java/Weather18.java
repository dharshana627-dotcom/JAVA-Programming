import java.util.Scanner;
public class Weather18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double totalTemp = 0;
        double highTemp = 0;
        double lowTemp = 0;
        int maxHour = -1, minHour = -1;
        int hotHours = 0 , coldHours = 0;

        for(int i=0;i<n;i++){
            int hour = sc.nextInt();
            double temp = sc.nextDouble();
            totalTemp += temp;

            if(temp > highTemp){
                highTemp = temp;
                maxHour = hour;
            }
            if(temp < lowTemp){
                lowTemp = temp;
                minHour = hour;
            }
            if(temp >= 32){
                hotHours++;
            }else if(temp <= 10){
                coldHours++;
            }
            String status="";
            if(temp > 40 || temp < 0){
                status="Extreme";
            }else if(temp >= 32 && temp <= 40){
                status="Hot";
            }else if(temp >= 0 && temp <= 10){
                status="Cold";
            }else if(temp >= 10 && temp <= 32){
                status="Normal";
            }  
            System.out.println("Hour "+hour+": " + temp);
            System.out.println("Status: "+status);
        }
        double avg=totalTemp/n;

        System.out.println("Total Readings: "+n);
        System.out.printf("Average Temperature: %.2f",avg);
        System.out.println("\nHighest Temperature: "+highTemp+ " at Hour "+maxHour);
        System.out.println("Lowest Temperature: "+lowTemp+" at Hour "+minHour);
        System.out.println("hot Hours: "+hotHours);
        System.out.println("Cold Hours: "+coldHours);
    }
}