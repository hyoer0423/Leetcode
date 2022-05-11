public class Solution {
    public int climbStairs(int n) {
        if(n==1 ||n==0||n==2)return n;
        int pre=1;
        int prepre=1;
        int cur=2;
        for (int i=2;i<=n;i++){
            cur=pre+prepre;
             prepre=pre;
            pre=cur;
           
        
            
}
        return cur;
        
    }
}class 70 {
    
}
