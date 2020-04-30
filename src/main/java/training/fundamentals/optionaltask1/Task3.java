package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();

        int minLength = numbers.get(0).length();
        int maxLength = numbers.get(0).length();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).length() < minLength) {
                minLength = numbers.get(i).length();
            } else if (numbers.get(i).length() > maxLength) {
                maxLength = numbers.get(i).length();
            }
        }

        double averageLength = ((double) minLength + maxLength) / 2;

        System.out.println("the length is less than the average of numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).length() < averageLength) {
                System.out.println(numbers.get(i) + " with length " + numbers.get(i).length());
            }
        }

        System.out.println("the length is greater than the average of numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).length() > averageLength) {
                System.out.println(numbers.get(i) + " with length " + numbers.get(i).length());
            }
        }
    }
}
