class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int[] int_list = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] char_list = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int j = 0;

        for (int i = 0; i < char_list.length; i++) {
            int leng = char_list[i].length() - 1;

            while ((j < s.length()) && ((j + leng) < s.length())
                    && s.substring(j, j + leng + 1).equals(char_list[i]) == true) {

                res += int_list[i];
                j = j + leng + 1;

            }

        }
        return res;

    }

}