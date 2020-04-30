package training.collections.optionaltask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C://1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> strings = new ArrayList<>();

        while (bufferedReader.ready()) {
            strings.add(bufferedReader.readLine());
        }

        FileWriter fileWriter = new FileWriter("C://1.txt");
        for (int i = strings.size() - 1; i >= 0; i--) {
            fileWriter.write(strings.get(i));
            fileWriter.write("\n");
        }
        fileWriter.flush();
        fileReader.close();
        bufferedReader.close();
        fileWriter.close();
    }
}
