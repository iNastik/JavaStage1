package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.List;

public class Task7 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();

        String numberContainingVariousDigits = "";
        for (int i = 0; i < numbers.size(); i++) {
            char[] digits = numbers.get(i).toCharArray();
            boolean repeat = false;
            for (int j = 1; j < digits.length; j++) {
                for (int k = 0; k < j; k++) {
                    if (digits[k] == digits[j]) {
                        repeat = true;
                    }
                }
            }
            if (!repeat) {
                numberContainingVariousDigits = numbers.get(i);
            }
            if (numberContainingVariousDigits.length() > 0) {
                break;
            }
        }
        System.out.println(numberContainingVariousDigits);
    }
}
