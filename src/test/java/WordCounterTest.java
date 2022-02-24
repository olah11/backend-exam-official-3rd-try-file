import hu.nive.ujratervezes.wordcounter.WordCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {
    @Test
    void test_countWords_normalParameters(){
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, new WordCounter().countWords("src/main/resources/test1.txt", 2) );
    }

    @Test
    void test_countWords_lastWordCounts(){
        int[] expected = new int[]{1,2,1,1};
        assertArrayEquals(expected, new WordCounter().countWords("src/main/resources/test2.txt", 4) );
    }

    @Test
    void test_countWords_lastWordCountsAndNotAllEndsWithDot(){
        int[] expected = new int[]{1,2,1,1};
        assertArrayEquals(expected, new WordCounter().countWords("src/main/resources/test3.txt", 4) );
    }

    @Test
    void test_countWords_notAllLinesHasWordWithGivenLength(){
        int[] expected = new int[]{1,0,0};
        assertArrayEquals(expected, new WordCounter().countWords("src/main/resources/test4.txt", 11) );
    }

    @Test
    void test_countWords_notExistingFile(){
        int[] expected = new int[0];
        assertArrayEquals(expected, new WordCounter().countWords("notExistingFile", 0) );
    }

}