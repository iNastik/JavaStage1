package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();
        List<String> sortedByIncreaseInLength = new ArrayList<>();

        int l = 1;
        while (sortedByIncreaseInLength.size() != numbers.size()) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i).length() == l) {
                    sortedByIncreaseInLength.add(numbers.get(i));
                }
            }
            l++;
        }
        for (String digit : sortedByIncreaseInLength) {
            System.out.println(digit);
        }
        System.out.println();

        for (int i = sortedByIncreaseInLength.size() - 1; i >= 0; i--) {
            System.out.println(sortedByIncreaseInLength.get(i));
        }
    }
}
