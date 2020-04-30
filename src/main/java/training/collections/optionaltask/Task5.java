package training.collections.optionaltask;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
    private List<Integer> getSortNumbers() {
        Integer[] data = {1, -3, 3, 4};
        List<Integer> numbers = Arrays.asList(data);

        Collections.sort(numbers);
        Collections.reverse(numbers);
        return numbers;
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.getSortNumbers();
        for (Integer number : task5.getSortNumbers()) {
            System.out.println(number);
        }
    }
}
