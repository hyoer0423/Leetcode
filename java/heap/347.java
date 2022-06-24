class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums==null||nums.length=0||k<=0) return null;
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer>  heap=new PriorityQueue<Integer>(k,new Comparator<Integer>()){
            @Override
            public int compare(Integer i1,Integer i2){
                if (map.get(i1)==map.get(i2))return 0;
                return map.get(i1)
            }
        }
        
        
    }
}