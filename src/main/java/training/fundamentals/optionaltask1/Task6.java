package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();

        boolean isThereNumber = false;
        for (int i = 0; i < numbers.size(); i++) {
            char[] digits = numbers.get(i).toCharArray();
            boolean increase = true;
            for (int j = 1; j < digits.length; j++) {
                if (digits[j - 1] >= digits[j]) {
                    increase = false;
                }
            }
            if (increase && numbers.get(i).length() != 1) {
                System.out.println(numbers.get(i));
                isThereNumber = true;
                return;
            }
        }

        if (!isThereNumber) {
            System.out.println("no such number");
        }
    }
}
