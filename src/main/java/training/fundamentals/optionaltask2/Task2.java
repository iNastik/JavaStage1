package training.fundamentals.optionaltask2;

import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        TaskUtility utility = new TaskUtility();
        int[][] matrix = utility.getMatrix();

        int n = utility.getN();
        int[] b = new int[n * n];

        int g = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[g] = matrix[i][j];
                g++;
            }
        }

        int max;
        int totalMax = 1;
        for (int i = 0; i < b.length - 1; i++) {
            max = 1;
            while (i < b.length - 1 && b[i] < b[i + 1]) {
                max++;
                i++;
            }
            if (max > totalMax) {
                totalMax = max;
            }
        }

        System.out.println("\n" + "the largest number of increasing matrix elements in a row :" + totalMax);
        int min = 1;
        int totalMin = 1;
        for (int i = 0; i < b.length - 1; i++) {
            min = 1;
            while (i < b.length - 1 && b[i] > b[i + 1]) {
                min++;
                i++;
            }
            if (min > totalMin) {
                totalMin = min;
            }
        }
        System.out.println("the largest number of decreasing matrix elements in a row :" + totalMin);
    }
}
