class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        Comparator<Integer>comparator=new Comparator<>()
        {
            public int compare(Integer a,Integer b){
                if(nums[a]!=nums[b]){
                    return Integer.compare(nums[a],nums[b]);
                }
                else return b-a;
            }
        };
        double[]res=new double[nums.length-k+1];
        TreeSet<Integer> min= new TreeSet<>(comparator.reversed());
        TreeSet<Integer> max= new TreeSet<>(comparator);
        int i;
        for(i=0;i<k;i++){
            min.add(i);
        }
        balance(min,max);
        res[0]=meadian(min,max,k,nums);
        int p=1;
        for(i=k;i<nums.length;i++){
            if(!max.remove(i-k)){
                min.remove(i-k);
            }
            max.add(i);
            min.add(max.pollFirst());
            balance(min,max);
            res[p]=meadian(min,max,k,nums);
            p++;
        }
        return res;

    }
    public void balance(TreeSet min,TreeSet max){
        while(max.size()<min.size()){
            max.add(min.pollFirst());
        }
    }
    public double meadian(TreeSet<Integer> min,TreeSet<Integer> max,int k,int[]nums){
        if(k%2==0){
            return ((double) nums[min.first()]+nums[max.first()])/2;
        }
        else{
            return (double)nums[max.first()];
        }
    }
    
}
