package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client clientTransfer = new Client();

        clientTransfer.setName("Lakatos Frodó");
        clientTransfer.setYear(1988);
        clientTransfer.setAddress("1184 Budapest, Lakatos utca 88.");

        System.out.println("Name: " + clientTransfer.getName());
        System.out.println("Year of birth: " + clientTransfer.getYear());
        System.out.println("Address: " + clientTransfer.getAddress());

        System.out.println("Please enter the address change!");

        Scanner scanner = new Scanner(System.in);
        String changedAddress= scanner.nextLine();
        clientTransfer.migrate(changedAddress);

        System.out.println("The address changed. The new address:");
        System.out.println(clientTransfer.getAddress());

    }
}
