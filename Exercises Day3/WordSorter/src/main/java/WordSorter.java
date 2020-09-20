import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class WordSorter {


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
        List<String> list = new ArrayList<String>(map.keySet());
        String sc = new Scanner(System.in).nextLine();
        if (sc.equals("Ascending order")) {
            Collections.sort(list, new AscendingLengthStringComparator());
            System.out.println(list);

        }
        if (sc.equals("Descending order")) {
            Collections.sort(list, new DescendingLengthStringComparator().reversed());
            System.out.println(list);

        }


    }
}






