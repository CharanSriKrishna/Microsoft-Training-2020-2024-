class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int smin=Integer.MAX_VALUE;
            int smax=Integer.MIN_VALUE;
            for(int j=i;j<nums.length;j++){
                smax=Math.max(smax,nums[j]);
                smin=Math.min(smin,nums[j]);
                sum+=(smax-smin);
            }
        }
        return sum;
    }
}
