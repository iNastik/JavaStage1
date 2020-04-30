package training.collections.optionaltask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C://verse.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> strings = new ArrayList<>();

        while (bufferedReader.ready()) {
            strings.add(bufferedReader.readLine());
        }

        fileReader.close();
        bufferedReader.close();

        Collections.sort(strings);

        for (String s : strings) {
            System.out.println(s);
        }
    }
}