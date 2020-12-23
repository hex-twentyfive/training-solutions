package interfacedefaultmethods.print;

public class Printer {

    public String print(Printable printable) {
        StringBuilder sB = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++) {
            if (!Printable.BLACK.equals(printable.getColor(i))) {
                sB.append("[" + printable.getColor(i) + "]");
            }
            sB.append(printable.getPage(i) + "\n");
        }
        return sB.toString();
    }

}
