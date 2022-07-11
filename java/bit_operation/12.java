class Solution {
    public String intToRoman(int num) {
        int[] int_list = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] char_list = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            while (num - int_list[i] >= 0) {
                num = num - int_list[i];
                sb.append(char_list[i]);

            }
            if (i < (int_list.length - 1)) {
                i++;
            }

        }
        return sb.toString();

    }
}