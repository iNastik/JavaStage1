package training.fundamentals.optionaltask2;

import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        TaskUtility utility = new TaskUtility();
        int[][] matrix = utility.getMatrix();
        int n = utility.getN();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean wasPositive = false;
            for (int j = 0; j < n; j++) {
                int number = matrix[i][j];
                if (number > 0) {
                    if (!wasPositive) {
                        wasPositive = true;
                    } else {
                        System.out.println(sum);
                        break;
                    }
                } else if (wasPositive) {
                    sum += number;
                }
                if (j == n - 1 && wasPositive) {
                    System.out.println("no required number of positive numbers");
                }
            }
        }
        System.out.println();
    }
}
