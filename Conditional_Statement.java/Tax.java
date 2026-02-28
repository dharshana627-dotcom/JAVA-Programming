import java.util.Scanner;
public class Tax{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        s.nextLine();
        String b = s.nextLine();
        double c = s.nextDouble();
        double d = s.nextDouble();

        double taxIncome = a - c;
        if (taxIncome < 0){
            taxIncome = 0;
        }
        int taxRate = 0;
        if (b.equalsIgnoreCase("C-Corp")) {
            if (taxIncome < 500000) {
                taxRate = 21;
            } else if (taxIncome <= 1000000) {
                taxRate = 24;
            } else if (taxIncome <= 2000000) {
                taxRate = 28;
            } else {
                taxRate = 30;
            }
        } else if (b.equalsIgnoreCase("S-Corp")) {
            if (taxIncome < 500000) {
                taxRate = 20;
            } else if (taxIncome <= 1000000) {
                taxRate = 25;
            } else {
                taxRate = 28;
            }
        } else if (b.equalsIgnoreCase("LLC")) {
            if (taxIncome < 200000) {
                taxRate = 15;
            } else if (taxIncome <= 500000) {
                taxRate = 18;
            } else {
                taxRate = 22;
            }
        } else if (b.equalsIgnoreCase("Partnership")) {
            if (taxIncome < 300000) {
                taxRate = 18;
            } else if (taxIncome <= 800000) {
                taxRate = 22;
            } else {
                taxRate = 26;
            }
        }

        double grossTax = taxIncome * taxRate / 100.0;
        double netTax = grossTax - d;
        if (netTax < 0){
            netTax = 0;
        }
        double effRate = 0;
        if (a > 0) {
            effRate = (netTax / a) * 100;
        }

        System.out.println("Annual Revenue: $" + a);
        System.out.println("Business Type: " + b);
        System.out.println("Deductible Expenses: $" + c);
        System.out.println("Tax Credits: $" + d);
        System.out.println("Taxable Income: $" + taxIncome);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Gross Tax: $" + grossTax);
        System.out.println("Net Tax After Credits: $" + netTax);
        System.out.println("Effective Tax Rate: " + effRate + "%");
    }
}