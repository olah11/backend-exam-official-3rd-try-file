package hu.nive.ujratervezes.wordcounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCounter {


    public int[] countWords(String fileName, int n) {
        List<String> ls = new ArrayList<>();
        if (n == 0) return new int[]{};
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ls.add(line);
            }
            int len = 0;
            int[] ret = new int[ls.size()];
            List<String> ls2 = new ArrayList<>();

            for (int i = 0; i < ls.size(); i++) {
                ls2 = List.of(ls.get(i).split(" "));
                len = 0;
                for (String s : ls2 ) {
                    if (s.contains("."))  s = s.substring(0, s.length() - 1);
                    if (s.contains("?")) s = s.substring(0, s.length() - 1);
                    if (s.contains("!")) s = s.substring(0, s.length() - 1);
                    if (s.length() == n) {
                        len++;
                    }
                }
                ret[i] = len;
            }
            return ret;
        } catch (IOException e) {
            return null;
        }
    }

}
