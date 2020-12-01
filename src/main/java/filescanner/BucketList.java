package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(Path.of("bucketlist.txty"))) {        //projek mappa root
            while (scanner.hasNextLine()) {
                String fileScanRow = scanner.nextLine();
                System.out.println(fileScanRow);
            }
        }
        catch (IOException ie) {
            System.out.println("File nem elérhető!");
            ie.printStackTrace();
        }


    }
}
