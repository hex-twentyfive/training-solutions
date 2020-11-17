package statements;

import java.util.Scanner;

public class InvestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of the investment!");
        int inputFund = scanner.nextInt();

        System.out.println("Please enter the interest rate of the investment!");
        int inputInterestRate = scanner.nextInt();

        Investment transferInvestment = new Investment(inputFund, inputInterestRate);

        System.out.println("");
        System.out.println("Investment amount: " + transferInvestment.getFund() + " Ft" );
        System.out.println("Annual interest rate: " + inputInterestRate + " %" );
        System.out.println("Capital share: " +  transferInvestment.getFund() + " Ft" );
        System.out.println("Yield for 50 days: " + transferInvestment.getYield(50) + " Ft");
        System.out.println("Amount withdrawn after 80 days: " + transferInvestment.close(80) + " Ft");
        System.out.println("active variable state? ==> " + transferInvestment.isActive());
        System.out.println("Money withdrawal attempt after 90 days: " + transferInvestment.close(90) + " Ft");
    }
}
