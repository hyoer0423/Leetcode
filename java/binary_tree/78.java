class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        if (nums==null) return res;
        res.add(new ArrayList<>());
        getResult(res,nums,0,new ArrayList<Integer>());
        return res;
        
    }
    private void getResult(List<List<Integer>> res,int[] nums, int level,ArrayList<Integer> lis){
        if (level==nums.length) return;
        for( int i=level;i<nums.length;i++){
            lis.add(nums[i]);
            res.add(new ArrayList<>(lis));
            getResult(res,nums,i+1,lis);
            lis.remove(lis.size()-1);
            
        }
        return;
        
    }
}