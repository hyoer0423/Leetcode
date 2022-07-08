class Solution {
    public boolean isBipartite(int[][] graph) {
        int length=graph.length;
        int[]color= new int[length];
        int notColored=-1;
        Arrays.fill(color,notColored);
        for(int i=0;i <length;i++){
            if(color[i]==notColored){
                color[i]=0;
                Queue <Integer> q=new LinkedList<>();
                q.offer(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int j:graph[node]){
                        if (color[j]!=notColored){
                            if (color[j]==color[node]) {
                                return false;
                                                     }
                        
                        else{
                            continue;
                        } 
                        }else{
                            color[j]=1-color[node];
                            q.offer(j);
                        }
                        
                        
                        
                    }
                }
            }
        }
        return true;
    }
}