package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable {

    private List<String> pages = new ArrayList<>();

    @Override
    public int getLength() {
        return this.pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return this.pages.get(pageNumber);
    }

    public void addPage(String page) {
        this.pages.add(page);
    }
}
