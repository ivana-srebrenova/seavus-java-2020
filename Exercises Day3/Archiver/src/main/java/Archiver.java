import java.io.File;
import java.io.IOException;

public interface Archiver {


    void archive(File directory, File archive) throws IOException;
}

