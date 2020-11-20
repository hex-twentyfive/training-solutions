package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person instPerson = new Person("Frodó",25);

        Person instPerson2 = instPerson;

        instPerson2.setName("Pippin");

        System.out.println(instPerson.getName() + " " + instPerson.getAge());
        System.out.println(instPerson2.getName() + " " + instPerson2.getAge());

        int a = 25;
        int b=a;
        b+=1;

        System.out.println(a);
        System.out.println(b);

        instPerson2 = new Person("Samu ",30);

        System.out.println(instPerson.getName() + " " + instPerson.getAge());
        System.out.println(instPerson2.getName() + " " + instPerson2.getAge());

    }

}
