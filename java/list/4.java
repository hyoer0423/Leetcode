class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int dot = 0;
        int ans = 0;
        int prev = 0;
        int mid = (l1 + l2) / 2;
        int i = 0, j = 0, s = 0;

        while (s < mid + 1) {
            if (j > (l2 - 1) || i <= (l1 - 1) && nums1[i] <= nums2[j]) {
                prev = ans;
                ans = nums1[i];
                s++;
                i++;

            } else {
                prev = ans;
                ans = nums2[j];
                j++;
                s++;

            }
        }
        if ((l1 + l2) % 2 != 0) {
            return ans;
        } else {

            return (double) (ans + prev) / 2;

        }

    }
}
