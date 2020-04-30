package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();

        int minDifferentDigitsCount = 0;
        String minNumberWithMinDifferentDigitsCount = "";
        for (int i = 0; i < numbers.size(); i++) {
            char[] digits = numbers.get(i).toCharArray();
            int differentDigitsCount = 0;
            for (int j = 0; j < digits.length; j++) {
                if (j == 0) {
                    differentDigitsCount = 1;
                } else {
                    boolean repeat = false;
                    for (int k = 0; k < j; k++) {
                        if (digits[k] == digits[j]) {
                            repeat = true;
                        }
                    }
                    if (!repeat) {
                        differentDigitsCount++;
                    }
                }
            }
            if (i == 0 || differentDigitsCount < minDifferentDigitsCount) {
                minDifferentDigitsCount = differentDigitsCount;
                minNumberWithMinDifferentDigitsCount = numbers.get(i);
            }
        }
        System.out.println("the number with a minimum number of different digits is: " + minNumberWithMinDifferentDigitsCount);
    }
}
