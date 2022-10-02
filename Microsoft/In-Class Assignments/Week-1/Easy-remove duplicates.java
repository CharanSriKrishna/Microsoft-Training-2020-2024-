class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        int st=0,st2=1;
        while(st2<k){
            if(nums[st]==nums[st2]){
                st2++;
            }
            else{
                st++;
                nums[st]=nums[st2];
                st2++;
            }
        }
        return st;
    }
}
