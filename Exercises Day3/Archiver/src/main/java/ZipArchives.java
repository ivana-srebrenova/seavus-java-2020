import java.io.File;
import java.io.IOException;

import net.lingala.zip4j.ZipFile;

public class ZipArchives implements Archiver {
    public ZipArchives() {
        super();
    }

    public void archive(File directory, File archive) throws IOException {
        new ZipFile(archive).addFolder(directory);

    }
}
