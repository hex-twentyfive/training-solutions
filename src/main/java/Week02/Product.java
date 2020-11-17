package Week02;

import java.util.Scanner;

import java.util.Scanner;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {

        return p.getName().equals(name) && Math.abs(code.length()-p.getCode().length())<2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az első termék nevét! ");
        String name = scanner.nextLine();
        System.out.println("Adja meg a termék kódját");
        String code = scanner.nextLine();


        Product termek = new Product(name, code);
        System.out.println("Adja meg a második termék nevét! ");
        name = scanner.nextLine();
        System.out.println("Adja meg a termék kódját");
        code = scanner.nextLine();

        Product termek2 = new Product(name, code);


        System.out.println("Adja meg a harmadik termék nevét! ");
        name = scanner.nextLine();
        System.out.println("Adja meg a termék kódját");
        code = scanner.nextLine();

        Product termek3 = new Product(name, code);

        System.out.println("Megegyezik az első és a második termék? ==>"+ termek.areTheyEqual(termek2));
        System.out.println("Megegyezik az első és a harmadik termék? ==>"+ termek.areTheyEqual(termek3));

    }
}
