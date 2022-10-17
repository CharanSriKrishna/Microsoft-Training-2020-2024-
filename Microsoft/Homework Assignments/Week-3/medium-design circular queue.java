class MyCircularQueue {
    int[]arr;
    int  fr=0;
    int ed=0;
    int siz=0;
    public MyCircularQueue(int k) {
        arr=new int[k];
        Arrays.fill(arr,-1);
    }
    
    public boolean enQueue(int value) {
        if(isEmpty()){
            fr=ed=0;
            arr[ed]=value;
            siz++;
            return true;
        }
        if(!isFull()){
            ed++;
            ed=ed%arr.length;
            arr[ed]=value;
            siz++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            arr[fr]=-1;
            fr++;
            fr=fr%arr.length;
            siz--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        return arr[fr];
    }
    
    public int Rear() {
        return arr[ed];
    }
    
    public boolean isEmpty() {
        return siz==0;
        
    }
    
    public boolean isFull() {
        return siz==arr.length;
        
    }
}
