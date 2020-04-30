package training.collections.optionaltask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task4 {
    private List<String> getSortedStringsFromFile() throws IOException {
        FileReader reader = new FileReader("C://verse.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        ArrayList<String> strings = new ArrayList<>();

        while (bufferedReader.ready()) {
            strings.add(bufferedReader.readLine());
        }
        CompareString compareString = new CompareString();
        Collections.sort(strings, compareString);
        return strings;
    }

    public static void main(String[] args) throws IOException {
        Task4 task4 = new Task4();
        List<String> strings = task4.getSortedStringsFromFile();
        for (String s : strings) {
            System.out.println(s);
        }

    }
}

class CompareString implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
