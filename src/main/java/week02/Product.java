package week02;

public class Product {

    private String name;
    private String code;

    public Product (String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual (Product p) {

        boolean equality = name.equals(p.getName());

        int lenghtDifference = code.length() - p.code.length();
        boolean lengthCriterion = Math.abs(lenghtDifference) < 2 ;

        return   equality && lengthCriterion;
    }           //2. verzió // p.getname() a paraméteren van meghívva

    public static void main(String[] args) {


        String testProduct1 = "Brick";
        String testCode1 = "1911";
        System.out.println("The 1st Product name: " + testProduct1 + "   Product code: " + testCode1);

        Product instProduct1 = new Product(testProduct1, testCode1);

        String testProduct2 = "Chiseled  brick";
        String testCode2 = "1912";
        System.out.println("The 2nd Product name: " + testProduct2 + "   Product code: " + testCode2);

        Product instProduct2 = new Product(testProduct2, testCode2);

        String testProduct3 = "Brick";
        String testCode3 = "19110";
        System.out.println("The 3rd Product name: " + testProduct3 + "   Product code: " + testCode3);

        Product instProduct3 = new Product(testProduct3, testCode3);

        System.out.println("\nAre the first and second products the same? ==> " + instProduct1.areTheyEqual(instProduct2));
        System.out.println("Are the first and third products the same? ==> " + instProduct1.areTheyEqual(instProduct3));
    }
}
