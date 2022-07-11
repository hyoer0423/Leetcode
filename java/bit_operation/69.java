class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        if (x < 1)
            return 0;
        if (x < 4)
            return 1;

        int left = 1;
        int right = x;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid)
                return mid;
            if (mid > x / mid) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (right < (x / right))
            return right;
        return left;

    }
}