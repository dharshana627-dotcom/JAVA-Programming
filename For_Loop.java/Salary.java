import java.util.Scanner;
class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double total = 0.0;

        for (int i = 1; i <= n; i++) {
            String empName = sc.next();
            double baseSalary = sc.nextDouble();
            int perfRate = sc.nextInt();
            sc.nextLine();
            int percent = 0;
            switch (perfRate) {
                case 5: percent = 15; break;
                case 4: percent = 10; break;
                case 3: percent = 5; break;
                case 2: percent = 2; break;
                case 1: percent = 0; break;
                default: percent = 0;
            }

            double finalSalary = baseSalary * (1 + percent / 100.0);
            total += finalSalary;

            System.out.println("Employee: " + empName);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + perfRate);
            System.out.println("Increment: " + percent + "%");
            System.out.println("Final Salary: $" + finalSalary);
            System.out.println();
        }

        
        System.out.println("Total Employees Processed: "+n);
        System.out.println("Total Payroll: $"+total);
        System.out.printf("Average Salary: $%.2f",(total / n));
    }
}