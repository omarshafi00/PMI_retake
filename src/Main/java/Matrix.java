import java.util.ArrayList;

public class Matrix {
    public static int minimum(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i < minValue) {
                    minValue = i;
                }
            }
        }
        return minValue;
    }

    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix) {
        ArrayList<Integer> divByThree=new ArrayList<>();
        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i%3 == 0) {
                    divByThree.add(i);
                }
            }
        }

        return divByThree;
    }
}