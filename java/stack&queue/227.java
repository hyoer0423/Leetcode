public class Solution {
    public int calculate(String s) {
        if(s==null || s.length()==0) return 0;
        Stack<Integer> st=new Stack<>();
        int result=0;
        int sign=1;
        int num=0;
        int div=0;
        
        int mul=0;
        for (char c : s.toCharArray()){
            if (c==' ') continue;
            
            if(Character.isDigit(c)){
               
                num= num*10+(c-'0')*sign;
                
                continue;
            }
            if (div==1){
                num=st.pop()/num;
                div=0;
            }
            if (mul==1){
                num=num*st.pop();
                mul=0;
                
            }
            
            st.push(num);
            num=0;
            if (c=='+'){
    
                sign=1;
                
                
                
            }
            else if (c=='-'){
               sign=-1;
              
                
            }
            else if(c=='*'){
                mul=1;
                sign=1;
                
            }
            else if(c=='/'){
                div=1;
                 sign=1;
                
            }
            
        }
          if (div==1){
                num=st.pop()/num;
                
            }
        if (mul==1){
           
                num=num*st.pop();
             
                
                
            }
       
        st.push(num);
        while(!st.isEmpty()){
            result=st.pop()+result;
            
        }
       
        return result;
        
    }
} 
