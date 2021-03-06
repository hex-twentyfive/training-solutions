package iostringwriter.longwords;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public void longWordHandler(Writer writer, List<String> words) {
        PrintWriter printWriter = new PrintWriter(writer);
            for (String word: words) {
                printWriter.print(word);
                printWriter.print(",(");
                printWriter.print(word.length());
                printWriter.println(")");
            }
    }

    public String stringWriterWrite(List<String> list) {
        StringWriter stringWriter = new StringWriter();
        try (stringWriter) {
            longWordHandler(stringWriter, list);
            return stringWriter.toString();
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write the file!", ioe);
        }
    }

}
