package training.fundamentals.optionaltask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        TaskUtility utility = new TaskUtility();
        int[][] matrix = utility.getMatrix();
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int n = utility.getN();
        int k = 0;
        boolean validK = false;

        while (validK == false) {
            System.out.println("введите число k:");
            String str = bufferedReader.readLine();
            k = Integer.valueOf(str);
            if (k < 0 || k >= n) {
                System.out.println("недопустимое значение k");
            } else {
                validK = true;
            }
        }

        boolean con = false;
        while (con == false) {
            con = true;
            for (int i = 0; i < n - 1; i++) {
                int var1 = matrix[i][k];
                int var2 = matrix[i + 1][k];
                if (var1 > var2) {
                    int[] buf = matrix[i];
                    matrix[i] = matrix[i + 1];
                    matrix[i + 1] = buf;
                    con = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] b = new int[n * n];

        int g = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[g] = matrix[i][j];
                g++;
            }
        }
    }
}
