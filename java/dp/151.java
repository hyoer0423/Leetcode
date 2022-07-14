class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int left = 0;
        char temp;
        int right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;

        }
        int i = 0;
        while (i < arr.length) {

            int j = i;
            while ((j < arr.length) && (arr[j] != ' ')) {
                j++;
                continue;
            }
            int r = j - 1;
            while (i <= r) {
                sb.append(arr[r]);
                r--;
            }
            sb.append(' ');
            while ((j < arr.length) && (arr[j] == ' ')) {
                j++;
                continue;
            }

            i = j;

        }

        return sb.toString().trim();

    }
}