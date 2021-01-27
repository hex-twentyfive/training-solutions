package week12d04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class TextDecoding {

/*    Töltsd le a példa bináris állomány a
      https://github.com/Training360/strukturavalto-java-public/raw/master/examples/week12d04/src/main/resources/secret.dat
      címről! Ez bájtokat tartalmaz, egy szöveg van titkosítva benne. Olvasd be bájtonként,
      és mindegyik bájthoz adjál hozzá tízet! Ez valójában egy karakterkód, ezt alakítsd át char típusú értékké!
      Majd egymás után írd ki ezeket a konzolra! Ne használj közöttük sortörést!
*/
    private Path fileLocation = Path.of("src/main/resources/week/week12d04/secret.dat");

    public void textDecoder(Path fileLocation) {
        StringBuilder decodedText = new StringBuilder();
        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(fileLocation))) {
            byte[] fileContent = inputStream.readAllBytes();

                for (int i=0; i<fileContent.length; i++) {
                    int decodedByte = fileContent[i] + 10;
                    decodedText.append((char)decodedByte);
                }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file!", ioe);
        }
        System.out.println(decodedText);
    }

    public static void main(String[] args) {
        TextDecoding access = new TextDecoding();
        access.textDecoder(access.fileLocation);
    }


}
