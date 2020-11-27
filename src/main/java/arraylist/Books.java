package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books{

    private List<String> Books = new ArrayList<>();


    public void add(String inputBooks) {           //felveszi a könyveket
        Books.add(inputBooks);
    }

 /*   public List<String> findAllByPrefix(String prefix) {            //mely az összes olyan könyvet visszaadja, mely címének eleje megegyezik a paraméterként átadott szöveggel.

    }*/

    public  List<String> getTitles() {               //visszaadja a könyvek címeit.
        return Books;
    }


    public static void main(String[] args) {

        String Book1 = "Az idő rövid története";
        String Book2 = "A tér és az idő természete";
        String Book3 = "A káosz létsíkja";
        String Book4 = "Mágusok tornya";

        Books instBooks = new Books();

        instBooks.add(Book1);
        instBooks.add(Book2);
        instBooks.add(Book3);
        instBooks.add(Book4);

        System.out.println(instBooks.getTitles());

    }

}

