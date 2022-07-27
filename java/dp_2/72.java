class Solution {
    public int minDistance(String word1, String word2) {
        int s = word1.length();
        int l = word2.length();
        int[][] arr = new int[s + 1][l + 1];
        for (int i = 0; i <= s; i++) {
            arr[i][0] = i;
        }
        for (int j = 0; j <= l; j++) {
            arr[0][j] = j;
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < l; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    arr[i + 1][j + 1] = arr[i][j];

                } else {
                    arr[i + 1][j + 1] = Math.min(Math.min(arr[i + 1][j], arr[i][j + 1]), arr[i][j]) + 1;

                }
            }
        }
        return arr[s][l];

    }
}