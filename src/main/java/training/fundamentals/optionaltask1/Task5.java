package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();

        int countOfNumbersContainsEvenDigits = 0;
        int countOfNumbersContainsEvenAndUnevenDigits = 0;
        for (int i = 0; i < numbers.size(); i++) {
            char[] digits = numbers.get(i).toCharArray();

            int evenDigits = 0;
            int unevenDigits = 0;
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] % 2 == 0) {
                    evenDigits++;
                } else {
                    unevenDigits++;
                }
            }

            if (evenDigits == numbers.get(i).length()) {
                countOfNumbersContainsEvenDigits++;
            } else if (evenDigits == unevenDigits) {
                countOfNumbersContainsEvenAndUnevenDigits++;
            }

        }
        System.out.println("the count of numbers with only even digits is " + countOfNumbersContainsEvenDigits);
        System.out.println("the count of numbers with an equal count of even and uneven digits " + countOfNumbersContainsEvenAndUnevenDigits);
    }
}
