class Solution {
    public String frequencySort(String s) {
        if(s==null || s.length()<=2) return s;
        HashMap<Character,Integer> count=new HashMap<>();
        for(char c: s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
            
        }
        PriorityQueue<Character> pq=new PriorityQueue<>(new Comparator<Character>(){
            @Override
            public int compare(Character c1,Character c2){
                if (count.get(c1)==count.get(c2)){
                    return c2-c1;
                }
                return count.get(c2)-count.get(c1);
                
            }
});
        StringBuilder sb=new StringBuilder();
        for(Character c:count.keySet()){
            pq.offer(c);
        }
        while(!pq.isEmpty()){
            Character c=pq.poll();
            int co=count.get(c);
            while(co-->0){
                sb.append(c);
                
                
            }
            
        }
        return sb.toString();
    }
    
}public class 451 {
    
}
