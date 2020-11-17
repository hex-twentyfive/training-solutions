package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books{

    private List<String> books = new ArrayList<>();

    public void addTitle(String  title) {
        books.add(title);
    }

    public List<String> getTitles() {
        return books;
    }

    public static void main(String[] args) {

        Books konyvLista = new Books();

        konyvLista.addTitle("Az idő rövid története");
        konyvLista.addTitle("A tér és az idő természete");
        konyvLista.addTitle("A káosz létsíkja");
        konyvLista.addTitle("Mágusok tornya");

        System.out.println(konyvLista.getTitles());
    }

}

