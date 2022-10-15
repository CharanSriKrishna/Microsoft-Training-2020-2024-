class MedianFinder {
    PriorityQueue<Integer>max=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer>min=new PriorityQueue<>();
    boolean even=true;
    public void addNum(int num) {

        if(!even){
            max.offer(num);
            min.offer(max.poll());
            
        }
        else{
            min.offer(num);
            max.offer(min.poll());
        }
        even=!even;
    }
    
    public double findMedian() {
        if(even){
            return (max.peek()+min.peek())/2.0;
        }
        return max.peek();
    }
}
