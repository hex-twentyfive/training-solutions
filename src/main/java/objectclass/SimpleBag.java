package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();
    int cursorPosition = -1;

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public int size() {
        return items.size();
    }

    public void beforeFirst() {
        cursorPosition = -1;
    }

    public boolean hasNext() {
        boolean emptyInspection = isEmpty();
//        boolean cursorPositionInspection = ( cursorPosition <= items.size() - 1 );
        boolean cursorPositionInspection = (cursorPosition >= items.size() - 1);
        return !(emptyInspection || cursorPositionInspection);
    }

    public Object next() {
        cursorPosition++;
        return items.get(cursorPosition);
    }

    public boolean contains(Object item) {
        return items.contains(item);

    }

    public int getCursor() {
        return cursorPosition;
    }

}
