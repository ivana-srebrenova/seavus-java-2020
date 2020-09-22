import java.io.File;
import java.io.IOException;

import net.lingala.zip4j.ZipFile;

public class ZipArchiver implements Archiver {
    public ZipArchiver() {
        super();
    }

    public void archive(File directory, File archive) throws IOException {
        new ZipFile(archive).addFolder(directory);

    }
}
