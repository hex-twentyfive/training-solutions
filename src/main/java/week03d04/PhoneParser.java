package week03d04;

public class PhoneParser {

    public Phone parsePhone(String s) {
        String prefix = s.substring(0, 2);
        String number = s.substring(2);
        Phone phone = new Phone(prefix, number);
        return phone;
    }

    public static void main(String[] args) {

        PhoneParser parser = new PhoneParser();

        Phone phone = parser.parsePhone("305551911");

        System.out.println("A körzetszám: " + phone.getPrefix());
        System.out.println("A telefonszám: " + phone.getNumber());
        System.out.println("A teljes telefonszám: " + phone.toString());

    }

}
