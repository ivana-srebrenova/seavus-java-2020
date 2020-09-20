import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import java.util.*;


public class WordSorterWithLambdaAndFilter {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        List<String> list = new ArrayList<>();
        String words = FileUtils.readFileToString(file, "UTF-8").toLowerCase().replaceAll("[^a-zA-Z ]", "");

        String[] parts = words.split(" ");
        for (String word : parts) {
            list.add(word);

        }

        int min = new Scanner(System.in).nextInt();
        int max = new Scanner(System.in).nextInt();
        String input = new Scanner(System.in).nextLine();

        List<String> uniqueWords = list.stream()
                .distinct()
                .filter(word -> word.length() >= min).filter(word -> word.length() <= max).collect(Collectors.toList());


        if (min == 0) {

            uniqueWords = list.stream()
                    .distinct().filter(word -> word.length() <= max)
                    .collect(Collectors.toList());

        }
        if (max == 0) {

            uniqueWords = list.stream().
                    distinct().filter(word -> word.length() >= min)
                    .collect(Collectors.toList());

        }
        if (input.equals("Ascending order")) {
            Collections.sort(uniqueWords, Comparator.comparing(word -> word.length()));
        } else if (input.equals("Descending order")) {
            Collections.sort(uniqueWords, Collections.reverseOrder(Comparator.comparing(word -> word.length())));
        }

        uniqueWords.forEach(System.out::println);
    }
}

