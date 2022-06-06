class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<Integer>();
        int result=0;
        for(String str: tokens){
            if(isNum(str)){
                 
                st.push(Integer.parseInt(str));       
            }
            else{
               
                Integer m=cal(str,st.pop(),st.pop());
               
                st.push(m);
            }
            
        }
        return st.pop();
        
        
    }
    private boolean isNum(String str){
        if(str.length( )==1 && (str.charAt(0)=='-' || str.charAt(0)=='+'||str.charAt(0)=='*'||str.charAt(0)=='/')){
            return false;
            
        }
        return true;
        
    }
    private Integer cal(String str,Integer a, Integer b){
        
        if (str.charAt(0)=='-'){
            return b-a;
        }
        if (str.charAt(0)=='+'){
            return a+b;
        }
        if (str.charAt(0)=='*'){
            return a*b;
        }
        if (str.charAt(0)=='/'){
            return b/a;
        }
        return 0;
    }
        
    }

