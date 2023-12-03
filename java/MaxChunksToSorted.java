
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int chunks = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max <= i)
                chunks++;
        }
        return chunks;
    }
}

public class MaxChunksToSorted {
    public static void main(String args[]) {
        Solution s = new Solution();
        int[] arr = { 4, 3, 2, 1, 0 };
        int result = s.maxChunksToSorted(arr);
        System.out.println(result);
    }
}
