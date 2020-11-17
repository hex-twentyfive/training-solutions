package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {

        boolean b = false;              //Értékadás elött az értéke nem kiíratható!
        System.out.println(b);

        int a = 2;
        int i = 3; int j = 4;
        int k = i;
        System.out.println(a + i + j + k);

        String s = "Hello World!";
        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(t);          // A Scope kifele működik
        }
        //System.out.println(x);  //A blokkon belüli x változó értékét nem tudjuk kiíratni.
    }
}
