class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 这边的操作相当于是重新定义了一个compare
        PriorityQueue<Integer> Heap= new PriorityQueue<>((n1,n2)->n1-n2);
        for(int n:nums){
            Heap.add(n);
            if(Heap.size()>k){
                Heap.poll();
            }
            
        }
        return Heap.poll();
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> Heap= new PriorityQueue<>((n1,n2)->n2-n1);
        for(int n:nums){
            Heap.add(n);
            
            
        }
        for (int i; i<k;i++){
            heap.poll();
        }
        return Heap.poll();
    }
}