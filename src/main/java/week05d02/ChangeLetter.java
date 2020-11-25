package week05d02;

public class ChangeLetter {


//    A week05d02.ChangeLetter osztályban írj meg egy String changeVowels(String) metódust, mely kicseréli a paraméterként átadott szövegben az angol magánhangzókat csillag karakterre. Írj hozzá teszteseteket is!

    public String changeVowels(String text) {

       String modifiedText = text.replace("a", "*");
       modifiedText = modifiedText.replace("e", "*");
       modifiedText = modifiedText.replace("i", "*");
       modifiedText = modifiedText.replace("o", "*");
       modifiedText = modifiedText.replace("u", "*");

       modifiedText = modifiedText.replace("A", "*");
       modifiedText = modifiedText.replace("E", "*");
       modifiedText = modifiedText.replace("I", "*");
       modifiedText = modifiedText.replace("O", "*");
       modifiedText = modifiedText.replace("U", "*");

        return modifiedText;
    }

    public static void main(String[] args) {

        String inputText = "This is a test text with lowercase and UPPERCASE!";

        ChangeLetter changeLetter = new ChangeLetter();

        System.out.println("\n Input test text  -->  " + inputText);
        System.out.println("\n Modified test text -->  " + changeLetter.changeVowels(inputText));

    }
}
