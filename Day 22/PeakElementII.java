import java.util.*;

public class PeakElementII {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 8, 10, 10},
                {14, 13, 12, 11},
                {15, 9, 11, 21},
                {16, 17, 19, 20}
        };

        int[] peak = findPeakGrid(matrix);
        System.out.println("Peak found at: Row = " + peak[0] + ", Column = " + peak[1]);
    }

    public static int[] findPeakGrid(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        int low = 0, high = row - 1;

        while (low <= high) {
