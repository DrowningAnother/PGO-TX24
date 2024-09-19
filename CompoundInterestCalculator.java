import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Enter ka number
            System.out.print("Enter the initial balance: ");
            double balance = input.nextDouble();
            System.out.print("Enter the interest rate (in %): ");
            double interestRate = input.nextDouble() / 100;

            // Dito calculate ng interest 10 years
            double annualInterest = 0;
            double monthlyInterest = 0;
            double dailyInterest = 0;

            for (int year = 0; year < 10; year++) {
                // Annual compounding toh
                annualInterest = balance * (1 + interestRate);
                balance = annualInterest;

                // Monthly compounding toh
                double monthlyBalance = balance;
                for (int month = 0; month < 12; month++) {
                    monthlyBalance *= (1 + interestRate / 12);
                }
                monthlyInterest = monthlyBalance;

                // Daily compounding toh
                double dailyBalance = balance;
                for (int day = 0; day < 365; day++) {
                    dailyBalance *= (1 + interestRate / 365);
                }
                dailyInterest = dailyBalance;
            }

            // Ito yung results 
            System.out.println("After 10 years, the balance will be:");
            System.out.printf("Annual compounding: %.2f\n", annualInterest);
            System.out.printf("Monthly compounding: %.2f\n", monthlyInterest);
            System.out.printf("Daily compounding: %.2f\n", dailyInterest);

            // Gusto mo ulitin?
            System.out.print("Do you want to repeat the calculation? (y/n): ");
            String response = input.next();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        input.close();
    }
}