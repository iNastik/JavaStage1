package training.fundamentals.optionaltask2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) throws IOException {
        TaskUtility utility = new TaskUtility();
        int[][] matrix = utility.getMatrix();
        int n = utility.getN();

        int max = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int number = matrix[i][j];
                if (number > max) {
                    max = number;
                }
            }
        }
        System.out.println(max);

        List<Integer> columns = new ArrayList<>();
        List<Integer> lines = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            boolean isContainMax = false;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == max) {
                    isContainMax = true;
                    break;
                }
            }
            if (!isContainMax) {
                lines.add(i);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            boolean isContainMax = false;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == max) {
                    isContainMax = true;
                    break;
                }
            }
            if (!isContainMax) {
                columns.add(i);
            }
        }

        int[][] newMatrix = new int[lines.size()][columns.size()];
        for (int i = 0; i < lines.size(); i++) {
            for (int j = 0; j < columns.size(); j++) {
                newMatrix[i][j] = matrix[lines.get(i)][columns.get(j)];
            }
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
