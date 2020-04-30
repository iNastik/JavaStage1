package training.collections.optionaltask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task8 {
    private List<String> getStringsFromFile() throws IOException {
        FileReader fileReader = new FileReader("C://verse.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<String> strings = new ArrayList<>();

        while (bufferedReader.ready()) {
            strings.add(bufferedReader.readLine());
        }
        return strings;
    }

    private Set<String> getWords() throws IOException {
        Set<String> wordsSet = new HashSet<>();
        for (String s : getStringsFromFile()) {
            String[] words = s.split("[\\.\\s]+");
            for (String word : words) {
                wordsSet.add(word.toLowerCase());
            }
        }
        return wordsSet;
    }

    public static void main(String[] args) throws IOException {
        Task8 task8 = new Task8();
        task8.getWords();
        for (String word : task8.getWords()) {
            System.out.println(word);
        }
    }

}
