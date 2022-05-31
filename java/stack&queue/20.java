class Solution {
    public boolean isValid(String s) {
         if(s==null || s.length()==0) return true;
        Stack <Character> st=new Stack <> ();
        for (char c:  s.toCharArray()){
            if (c =='('||c=='['||c=='{'){
                st.push(c);
            }
            else{
                if (st.isEmpty()) return false;
                char t=(char)st.pop();
                if (c==')'){
                   if(t!='(')  return false;
                        
                }
                 if (c==']'){
                   if(t!='[')  return false;
                        
                }
                if (c=='}'){
                   if(t!='{')  return false;
                }
                
                
            }
        }
        return st.isEmpty();
        
    }
}