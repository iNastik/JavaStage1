package training.fundamentals.optionaltask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskUtility {
    private int n = 0;
    static int a;

    public int[][] getMatrix() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int[][] matrix = null;
        boolean validN = false;

        while (validN == false) {
            System.out.println("введите число n:");
            String str = bufferedReader.readLine();
            n = Integer.parseInt(str);
            if (n <= 0) {
                System.out.println("недопустимое значение n");
            } else {
                validN = true;
                matrix = new int[n][n];
            }
        }

        System.out.println("введите число M:");
        String str = bufferedReader.readLine();
        int m = Integer.parseInt(str);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = -m + (int) (Math.random() * 2 * m);
                matrix[i][j] = x;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public int getN() {
        return n;
    }
}