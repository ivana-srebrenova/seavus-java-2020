import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String algorithm = sc.nextLine();

        File f = new File("Files");

        if (algorithm.equals("7z")) {

            SevenZipArchives sevenZip = new SevenZipArchives();
            File sevenZipArchive = new File("archive.7z");
            sevenZip.archive(f, sevenZipArchive);
            System.out.println("The 'archive.7z' has been created");

        }
        if (algorithm.equals("zip")) {

            ZipArchives zip = new ZipArchives();
            File zipArchive = new File("archive.zip");
            zip.archive(f, zipArchive);
            System.out.println("The 'archive.zip' is created");
        }

    }


}

