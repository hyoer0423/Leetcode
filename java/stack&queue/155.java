class MinStack {
    Stack <Integer> stack;
    Stack <Integer> minstack;

    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
        
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()){
            minstack.push(val);
            
        }
        else{
            minstack.push(Math.min(minstack.peek(),val));
        }
        
    }
    
    public void pop() {
       if (stack.isEmpty()) return;
        minstack.pop();
        stack.pop();

    }
    
    public int top() {
        return stack.peek();
        
        
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
