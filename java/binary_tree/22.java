class Solution {
    public List<String> generateParenthesis(int n) {
            List<String> res=new ArrayList<>();
            if (n<=0) return res;
            getResult(n,n,new StringBuilder(),res);
            return res;
        
    }
    private void getResult(int left, int right , StringBuilder sb,List<String> Result){
        if(left==0 && right==0){
            Result.add(sb.toString());
            return;
        }
        if(left>right) return;
        if(left>0){
            sb.append('(');
            getResult(left-1,right,sb,Result);
            sb.deleteCharAt(sb.length()-1);
            
        }
        if(right>0 && right>left ){
            sb.append(')');
            getResult(left,right-1,sb,Result);
            sb.deleteCharAt(sb.length()-1);
            
        }
        
    }
}