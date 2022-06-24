class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result=new LinkedList<>();
        if(words==null||words.length==0||k<=0) return result;
    Map<String,Integer> map=new HashMap<>();
        for (String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue <String> heap= new PriorityQueue<String>(k,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                if (map.get(s1)==map.get(s2)){
                    return s2.compareTo(s1);
            
                }
                return map.get(s1)>map.get(s2)?  1:-1;
               
            }
        });
             for(String key:map.keySet()){
                    if(heap.size()<k){
                        heap.offer(key);
                    }else{
                        if(map.get(key)>=map.get(heap.peek())){
                            heap.offer(key);
                            heap.poll();
                            
                        }
                    }
                    
                }
        while(!heap.isEmpty()){
            result.add(0,heap.poll());
            
        }
        return result;
        
        
        
        
    }
}
}
