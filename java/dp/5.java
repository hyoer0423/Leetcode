class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;
        int[] max = new int[1];
        int[] result = new int[2];
        for (int i = 0; i < s.length(); i++) {
            findMax(s, i, i, max, result);
            findMax(s, i, i + 1, max, result);
        }
        return s.substring(result[0], result[1]);

    }

    private void findMax(String s, int i, int j, int[] max, int[] result) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;

            } else {
                break;

            }
        }
        int dist = j - i - 1;
        if (dist > max[0]) {
            max[0] = dist;
            result[0] = i + 1;
            result[1] = j;
        }

    }

}