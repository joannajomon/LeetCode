class MinStack {
      int[] stack;
      int[] minStack;
      int mintop;
      int top;
    public MinStack() {
         stack= new int[40000];
         top=-1;
         minStack= new int[40000];
         mintop=-1;
    }
    
    public void push(int value) {
        stack[++top]=value;
       if(mintop==-1 || value<=minStack[mintop])
          minStack[++mintop]=value;
       
        }

    
        
    
    
    public void pop() {
      if(stack[top]==minStack[mintop]){
        mintop--;
      }
        
       top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return minStack[mintop];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */