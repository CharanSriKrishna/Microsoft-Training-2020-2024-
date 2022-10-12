class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0,ed=nums.length-1,mid=0;
        while(st<=ed)
        {
            mid=(st+ed)/2;
            if(nums[mid]==target){
                 return mid;
            }
            else if (nums[mid]>target){
                 ed=mid-1;
            }
            else if (nums[mid]<target){
                 st=mid+1;
            }
        }
        if(nums[mid]<target){
            return mid+1;
        }
        return mid;
    }
}
