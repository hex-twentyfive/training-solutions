package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books{

    private List<String> books = new ArrayList<>();


    public void add(String inputBooks) {                             //felveszi a könyveket
        books.add(inputBooks);
    }

    public List<String> findAllByPrefix(String prefix) {             //mely az összes olyan könyvet visszaadja, mely címének eleje megegyezik a paraméterként átadott szöveggel.
        List<String> startsWithPrefix = new ArrayList<>();
        for (String elements : books) {
          if ( elements.startsWith(prefix) ) {
              startsWithPrefix.add(elements);
          }
        }
        return startsWithPrefix;
    }

    public  List<String> getTitles() {                                //visszaadja a könyvek címeit.
        return books;
    }

    public void removeByPrefix(String prefix) {                        //Bónusz 2.
         for (int i = 0; i < books.size(); i++) {
            if ( books.get(i).startsWith(prefix) ) {
                    books.remove(i);
            }
        }
    }

    public static void main(String[] args) {

        String Book1 = "Az idő rövid története";
        String Book2 = "A tér és az idő természete";
        String Book3 = "A káosz létsíkja";
        String Book4 = "Mágusok tornya";

        String searchedPrefix = "Mágus";

        Books instBooks = new Books();

        instBooks.add(Book1);
        instBooks.add(Book2);
        instBooks.add(Book3);
        instBooks.add(Book4);

        System.out.println("\n A könyvekkel feltöltött lista  -->  " + instBooks.getTitles());
        System.out.println("\n A keresett prefix-el rendelkező könyv prefix:\"Mágus\"  -->  " + instBooks.findAllByPrefix(searchedPrefix));

        instBooks.removeByPrefix(searchedPrefix);

        System.out.println("\n A keresett prefix-el rendelkező könyv eltávolítása a listából  prefix:\"Mágus\"");
        System.out.println(" A lista törlés utáni állapota -->  " + instBooks.getTitles());

    }
}

