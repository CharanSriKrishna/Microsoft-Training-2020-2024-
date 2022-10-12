class MinStack {
    class Node{
        int val;
        int max;
        public Node(int key,int max){
            this.val=key;
            this.max=max;
        }
    }
    Stack<Node>st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        int cur=(st.isEmpty()?val:st.peek().max);
        int min=cur>val?val:cur;
        Node nn=new Node(val,min);
        st.push(nn);

    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().val;
    }
    
    public int getMin() {
        return st.peek().max;
    }
}
