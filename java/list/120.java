class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();
        int[] minDepth = new int[size + 1];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                minDepth[j] = Math.min(minDepth[j], minDepth[j + 1]) + triangle.get(i).get(j);

            }

        }
        return minDepth[0];

    }
}