class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            if (i != mat.length - 1 - i) {
                sum = sum + (mat[i][i] + mat[i][mat.length - i - 1]);
                // sum = +(mat[i][i] + mat[i][mat.length - i - 1]);

            } else {
                sum = sum + mat[i][i];
            }
            // System.out.println(mat[i][i]);
            System.out.println(mat[i][mat.length - 1 - i]);
        }
        return sum;
    }
}

public class SumOfDiagonalMatrix {
    public static void main(String args[]) {
        Solution s = new Solution();
        int[][] x = {
                { 1, 2, 3, 5 },
                { 4, 5, 6, 8 },
                { 7, 8, 9, 6 },
                { 4, 1, 7, 5 }
        };
        int[][] y = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        // int a = s.diagonalSum(x);
        int b = s.diagonalSum(y);

        // System.out.println(a);
        System.out.println(b);

    }
}