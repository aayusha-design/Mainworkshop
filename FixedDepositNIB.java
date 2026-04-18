import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {

            System.out.print("Enter deposit amount (Rs.): ");
            double P = sc.nextDouble();

            if (P < 1000) {
                System.out.println("Minimum deposit is Rs. 1000");
                continue;
            }

            System.out.print("Enter annual interest rate (8–12%): ");
            double annualRate = sc.nextDouble();

            if (annualRate < 8 || annualRate > 12) {
                System.out.println("Interest rate must be between 8% and 12%");
                continue;
            }

            System.out.print("Enter duration (in years, max 5): ");
            int years = sc.nextInt();

            if (years > 5 || years <= 0) {
                System.out.println("Duration must be between 1 and 5 years");
                continue;
            }

            double monthlyRate = (annualRate / 100) / 12;
            int months = years * 12;

            double A = P * Math.pow((1 + monthlyRate), months);

            double feeRate = 0.005;
            double fee = A * feeRate;

            double finalAmount = A - fee;

            System.out.println("\n--- FD Details ---");
            System.out.println("Principal (P): Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Duration: " + years + " years (" + months + " months)");
            System.out.println("Maturity Amount (A): Rs. " + Math.round(A));
            System.out.println("Processing Fee (0.5%): Rs. " + Math.round(fee));
            System.out.println("Final Amount: Rs. " + Math.round(finalAmount));

            System.out.print("\nDo you want to calculate another FD? (y/n): ");
            choice = sc.next().charAt(0);
        }

        sc.close();
        System.out.println("Thank you for using NIB FD Calculator!");
    }
}