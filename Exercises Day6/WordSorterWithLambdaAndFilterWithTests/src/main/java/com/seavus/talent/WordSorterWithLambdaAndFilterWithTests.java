package com.seavus.talent;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class WordSorterWithLambdaAndFilterWithTests {


    public static void main(String[] args) throws IOException {

        int min = new Scanner(System.in).nextInt();
        int max = new Scanner(System.in).nextInt();
        String input = new Scanner(System.in).nextLine();
        List<String> words = loadWordsFromFile();
        List<String> filteredAndSortedWords = sortAndFilterWords(words, min, max, input);
        filteredAndSortedWords.stream().forEach(System.out::println);

    }


    public static List<String> loadWordsFromFile() throws IOException {
        File file = new File("file.txt");
        String words = FileUtils.readFileToString(file, "UTF-8").replaceAll("[^a-zA-Z ]", "");
        String[] parts = words.toLowerCase().split(" ");
        return Arrays.asList(parts);
    }

    public static List<String> sortAndFilterWords(List<String> list, int min, int max, String input) {
        list = max == 0 ? list.stream().distinct().filter(word -> word.length() >= min).collect(Collectors.toList()) : list.stream().filter(word -> word.length() >= min).filter(word -> word.length() <= max)
                .collect(Collectors.toList());

        if (input.equals("Ascending order")) {
            Collections.sort(list, Comparator.comparing(word -> word.length()));
        } else if (input.equals("Descending order")) {
            Collections.sort(list, (word1, word2) -> word2.length() - word1.length());
        }

        return list;

    }


}

