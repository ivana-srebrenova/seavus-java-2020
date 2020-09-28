package com.seavus.talent;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordSorterTest {
    private WordSorterWithLambdaAndFilterWithTests wordSorterTests;


    @BeforeEach
    void setUp() {
        wordSorterTests = new WordSorterWithLambdaAndFilterWithTests();
    }

    @Test
    public void fileExists() throws IOException {
        File filePath = new File("file.txt");
        Assertions.assertTrue(filePath.exists());
    }

    @Test
    void sortAndFilterWordsAsc() {
        List<String> words = Arrays.asList("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua");
        List<String> filteredAndSortedWords = wordSorterTests.sortAndFilterWords(words, 3, 4, "Ascending order");
        Assertions.assertEquals(Arrays.asList("sit", "sed", "amet", "elit"), filteredAndSortedWords);
    }

    @Test
    void sortAndFilterWordsDesc() {
        List<String> words = Arrays.asList("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua");
        List<String> filteredAndSortedWords = wordSorterTests.sortAndFilterWords(words, 0, 5, "Descending order");
        Assertions.assertEquals(Arrays.asList("lorem", "ipsum", "dolor", "magna", "amet", "elit", "sit", "sed", "do", "ut", "et"), filteredAndSortedWords);

    }

    @Test
    void sortAndFilterWordsMaxNull() {
        List<String> words = Arrays.asList("lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit", "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore", "magna", "aliqua");
        List<String> filteredAndSortedWords = wordSorterTests.sortAndFilterWords(words, 7, 0, "Descending order");
        Assertions.assertEquals(Arrays.asList("consectetur", "adipiscing", "incididunt", "eiusmod"), filteredAndSortedWords);

    }

}
