public class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        Stack<Integer> st=new Stack<>();
        int result=0;
        int sign=1;
        int num=0;
        for (char c : s.toCharArray()){
            
            if(c==' ') continue;
            if(Character.isDigit(c)){
               
                num= num*10+(c-'0')*sign;
                
                continue;
            }
            if (c=='+'){
                sign=1;
                
                result=result+num;
                num=0;
            }
            else if (c=='-'){
                sign=-1;
                result=result+num;
                num=0;
            }
            else if (c=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
                
            }
            else{
                 result=result+num;
                 num=0;
                
                result=st.pop()*result+st.pop();
                
            }
            
            
            
            
                
            
            
        }
        result=result+num;
        return result;
        
    }
} 