package ioreadbytes.bytematrix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MatrixReader {

   private List<byte[]> matrixDataContent = new ArrayList<>();

   public void fileByteReader(Path fileLocation) {
       try (InputStream inputStream = Files.newInputStream(fileLocation)) {
           byte[] buffer = new byte[1000];
           int bufferSize = 0;
           while ((bufferSize = inputStream.read(buffer)) > 0) {
               matrixDataContent.add(buffer);
           }
       }
       catch (IOException ioe) {
           throw new IllegalStateException("Can not read the file!", ioe);
       }
   }

   public int matrixContentScanner(List<byte[]> matrix) {
       int numberOfMatrixColumnsWhereTheNullIsDominate = 0;
       for (byte[] matrixElement: matrix) {
           int nullCounter = 0;
           int oneCounter = 0;
           for(byte Byte: matrixElement) {
               if (Byte == 48) {
                   nullCounter++;
               }
               else if (Byte == 49) {
                   oneCounter++;
               }
           }
           if (nullCounter > oneCounter) {
               numberOfMatrixColumnsWhereTheNullIsDominate++;
           }
       }
    return numberOfMatrixColumnsWhereTheNullIsDominate;
   }

    public List<byte[]> getMatrixDataContent() {
        return new ArrayList<>(matrixDataContent);
    }

}
