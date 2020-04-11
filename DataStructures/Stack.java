class MinStack {

    /** initialize your data structure here. */
    List<Integer> list = new ArrayList<Integer>();
    Stack<Integer> stack = new Stack<>();
    
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        list.add(x);
        if(stack.isEmpty() || stack.peek() >= x){
            stack.push(x);
        }
        
    }
    public void pop() {
        if(list.size()>0){
            if(this.top() == stack.peek()) stack.pop();
            list.remove(list.size()-1);    
        }
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */