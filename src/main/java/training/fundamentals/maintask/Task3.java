package training.fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        System.out.println("enter count of numbers");
        String number = bufferedReader.readLine();
        int n = Integer.parseInt(number);

        for (int i = 0; i < n; i++) {
            double a = Math.random();
            System.out.println(a);
        }

        for (int i = 0; i < n; i++) {
            double a = Math.random();
            System.out.print(a + " ");
        }
    }
}
