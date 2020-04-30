package training.fundamentals.optionaltask1;

import java.io.IOException;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<String> numbers = TaskUtility.getStringData();

        String longNum = numbers.get(0);
        String shortNum = numbers.get(0);
        int minLength = numbers.get(0).length();
        int maxLength = numbers.get(0).length();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).length() < minLength) {
                minLength = numbers.get(i).length();
                shortNum = numbers.get(i);
            } else if (numbers.get(i).length() > maxLength) {
                maxLength = numbers.get(i).length();
                longNum = numbers.get(i);
            }
        }
        System.out.println("the shortest number is " + shortNum + " with length " + minLength);
        System.out.println("the longest number is " + longNum + " with length " + maxLength);
    }
}
