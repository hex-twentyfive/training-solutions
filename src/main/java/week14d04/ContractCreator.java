package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String name, List<Integer> monthlyPrices) {
        template = new Contract(name, monthlyPrices);
    }

    public Contract create(String client) {          //Van egy sablon és az alapján hozunk létre új szerződéseket.
        return new Contract(template, client);
    }


    public static void main(String[] args) {
        ContractCreator creator = new ContractCreator("Minta János", new ArrayList<>(List.of(10, 10, 10)));
        Contract contract1 = creator.create("John Doe");
        Contract contract2 = creator.create("Jack Doe");

        System.out.println(contract1);
        System.out.println(contract2);

        contract1.getMonthlyPrices().set(1, 20);
        System.out.println(contract1);
        System.out.println(contract2);

        Contract contract3 = creator.create("Jane Doe");
        System.out.println(contract3);
    }
}