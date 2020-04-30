package training.collections.optionaltask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Task2 {
    private int getData() throws IOException {
        System.out.println("enter number:");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String number = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder(number);
        stringBuilder.reverse();
        return Integer.parseInt(stringBuilder.toString());
    }

    private Stack<Integer> getStack() throws IOException {
        int number = getData();
        Stack<Integer> digits = new Stack<>();

        while (number != 0) {
            digits.push(number % 10);
            number /= 10;
        }

        return digits;
    }

    public static void main(String[] args) throws IOException {
        Task2 task2 = new Task2();
        Stack<Integer> digitsStack = task2.getStack();

        while (!digitsStack.empty()) {
            System.out.print(digitsStack.pop());
        }
    }
}
