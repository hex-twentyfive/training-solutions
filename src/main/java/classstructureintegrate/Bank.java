package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("10073217-12000098-67341590", "Tóth Kálmán", 103400);
        System.out.println(bankAccount1.getInfo());

        BankAccount bankAccount2 = new BankAccount("10071547-12000177-15359547", "Lakatos Frodó", 68500);
        System.out.println(bankAccount2.getInfo());

        System.out.println("");
        System.out.println(bankAccount1.owner + " (" + bankAccount1.accountNumber + ") - Deposit to the bank account selected");
        System.out.println("Please specify how much would you like to deposit!");
        Scanner scanner = new Scanner(System.in);
        int amountInput1 = scanner.nextInt();
        bankAccount1.deposit(amountInput1);
        System.out.println(bankAccount1.getInfo());

        System.out.println("");
        System.out.println(bankAccount2.owner + " (" + bankAccount2.accountNumber + ") - Deposit to the bank account selected");
        System.out.println("Please specify how much would you like to deposit!");
        int amountInput2 = scanner.nextInt();
        bankAccount2.deposit(amountInput2);
        System.out.println(bankAccount2.getInfo());

        System.out.println("");
        System.out.println(bankAccount1.owner + " (" + bankAccount1.accountNumber + ") - Withdraw to the bank account selected");
        System.out.println("Please specify how much would you like to withdraw!");
        int amountInput3 = scanner.nextInt();
        bankAccount1.withdraw(amountInput3);
        System.out.println(bankAccount1.getInfo());

        System.out.println("");
        System.out.println(bankAccount2.owner + " (" + bankAccount2.accountNumber + ") - Withdraw to the bank account selected");
        System.out.println("Please specify how much would you like to withdraw!");
        int amountInput4 = scanner.nextInt();
        bankAccount2.withdraw(amountInput4);
        System.out.println(bankAccount2.getInfo());

        System.out.println("");
        System.out.println("Please specify how much Ft would you like to transfer between the accounts!");
        int amountInput5 = scanner.nextInt();
        bankAccount1.transfer(bankAccount2, amountInput5);

        System.out.println("");
        System.out.println(bankAccount1.getInfo());
        System.out.println(bankAccount2.getInfo());
    }
}
