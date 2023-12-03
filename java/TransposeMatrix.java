
class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[j][i];
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        return result;
    }
}

public class TransposeMatrix {
    public static void main(String args[]) {
        Solution s = new Solution();
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println(s.transpose(a));
    }
}
