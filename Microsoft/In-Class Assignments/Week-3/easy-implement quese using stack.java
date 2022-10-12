class MyQueue {
    Stack<Integer>queue;
    Stack<Integer>queue2;
    public MyQueue() {
        queue=new Stack<>();
        queue2=new Stack<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        if(queue2.isEmpty()){
            while(!queue.isEmpty()){
                queue2.add(queue.pop());
            }
        }
        return queue2.pop();
    }
    
    public int peek() {
        if(queue2.isEmpty()){
            while(!queue.isEmpty()){
                queue2.add(queue.pop());
            }
        }
        return queue2.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty() && queue2.isEmpty();
    }
}
