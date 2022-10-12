class MyStack {
    Queue <Integer> stack;
    public MyStack() {
        stack=new LinkedList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        for(int i=1;i<stack.size();i++){
            stack.add(stack.remove());
        }
    }
    
    public int pop() {
        return stack.remove();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}
