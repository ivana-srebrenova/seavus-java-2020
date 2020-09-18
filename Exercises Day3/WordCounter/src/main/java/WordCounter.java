import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class WordCounter {

    public static void main(String[] args) throws IOException {

        File file = new File("file.txt");

        String str = FileUtils.readFileToString(file, "UTF-8").toLowerCase();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        String line = str.replaceAll("[^a-zA-Z ]", "");

        String[] parts = line.split(" ");
        for (String word : parts) {
            if (map.containsKey(word)) {
                int c = map.get(word);
                map.put(word, c + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("<" + entry.getKey() + ">" + ":" + "<" + entry.getValue() + ">");
        }


    }
}




