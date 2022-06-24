class Node{
    public int val;
    public List <Node> children;
    public Node(int _val){
        val=_val;

    }
    public Node(int _val,List<Node> _children){
        val=_val;
        children=_children;
    }
};


class Solution {

    public int maxDepth(Node root) {
       if(root==null) return 0;
       Queue<Node> queue =new LinkedList<>() ;
        queue.offer(root);
        int depth=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                Node temp=queue.poll();
                for(Node child:temp.children){
                    queue.offer(child);
                    
                }
                
            }
            depth++;
        }
        return depth;
        
    }
    
}