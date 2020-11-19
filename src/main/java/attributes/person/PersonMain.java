package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person test = new Person("Legolas, Lakatos ", "5551911IL");

        System.out.println(test.personToString());
        Address address = new Address("Hungary","Budapest","Áram utca 10.","1911");

        test.moveTo(address);
        System.out.println(test.getAddress().addressToString());

        address.correctData("England","London","Downing street 10.","SW1A 2AA");
        System.out.println(test.getAddress().addressToString());
    }


}
