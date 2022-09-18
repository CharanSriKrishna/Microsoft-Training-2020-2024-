class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer, Integer>map=new HashMap<Integer,Integer>();
        int max=nums.length;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=1;i<=max+1;i++){
            if(map.containsKey(i)){
                continue;
            }
            else{
                return i;
            }
        }
        return max;
    }
}
