import java.util.Scanner;
public class Bank20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        double tDepo = 0;
        double tWith = 0;
        double tTrans = 0;
        double tPay = 0;

        for (int i=1;i<=n;i++) {
            String transType = sc.next();
            double amnt = sc.nextDouble();
            String category;
            switch (transType) {
                case "Deposit":
                    category = "Credit";
                    tDepo += amnt;
                    break;
                case "Withdrawal":
                    category = "Debit";
                    tWith += amnt;
                    break;
                case "Transfer":
                    category = "Debit";
                    tTrans += amnt;
                    break;
                case "Payment":
                    category = "Debit";
                    tPay += amnt;
                    break;
                default:
                    category = "Unknown";
            }

            System.out.println("Transaction "+i+": "+transType);
            System.out.println("Amount: $"+amnt);
            System.out.println("Category: "+category);
            System.out.println("\n");
        }

        double netBal=tDepo-(tWith+tTrans+tPay);

        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+tDepo);
        System.out.println("Total Withdrawals: $"+tWith);
        System.out.println("Total Transfers: $"+tTrans);
        System.out.println("Total Payments: $"+tPay);
        System.out.println("Net Balance Change: $"+netBal);
    }
}