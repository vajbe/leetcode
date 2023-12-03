class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = -1;
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            int len = s.split(" ").length;
            if (len > maxWords) {
                maxWords = len;
            }
        }
        return maxWords;
    }
}

public class MaxNumOfWords {
    public static void main(String args[]) {
        Solution s = new Solution();
        String[] input = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int max = s.mostWordsFound(input);
        System.out.println(max);
    }
}
