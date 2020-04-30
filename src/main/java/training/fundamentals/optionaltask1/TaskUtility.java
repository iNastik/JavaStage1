package training.fundamentals.optionaltask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TaskUtility {
    public static List<String> getStringData() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println("enter numbers:");
        String numbers = bufferedReader.readLine();
        String[] data = numbers.split(" ");

        if (data.length == 0) {
            System.out.println("no data");
        }

        List<String> nums = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (data[i].matches("^\\d+$")) {
                nums.add(data[i]);
            }
        }

        return nums;
    }
}
