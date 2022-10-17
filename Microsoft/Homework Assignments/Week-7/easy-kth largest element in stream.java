class KthLargest {
    PriorityQueue<Integer>min=new PriorityQueue<>();
    int ks;
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
            min.add(nums[i]);
            //System.out.println(min.peek());
        }
        ks=k;
        check();
        //System.out.println(min.peek());
    }
    public void check(){
        while(min.size()>ks){
            min.poll();
        }
    }
    public int add(int val) {
        min.add(val);
        check();
        //System.out.println(min.peek());
        return min.peek();
    }
}
