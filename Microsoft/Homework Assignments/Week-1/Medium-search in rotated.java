class Solution {
    public int search(int[] nums, int target) {
        int araylen=nums.length-1;
        int st=0;
        while(st<=araylen){
            int m=(st+araylen)/2; 
            if(nums[m]==target){
                return m;
            }
            if(nums[st]<=nums[m]){       //left sorted
               if(target>=nums[st] && target<=nums[m]){
                   araylen=m-1;}      //right
               else{
                   st=m+1;}     //left
            } 
            else{                       //right sorted 
               if(target>= nums[m] && target<=nums[araylen]){
                    st=m+1;}   //left
               else{
                    araylen=m-1;}    //right
           }
        }
        return -1;
    }
}
