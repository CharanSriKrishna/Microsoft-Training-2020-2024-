class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=nums.length;
        int [] index=new int[2];
        Map<Integer, Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<a;i++){
            //for(int j=i+1;j<a;j++){
                if(map.containsKey(target-nums[i])){
                    index[0]=i;
                    index[1]=map.get(target-nums[i]);
                    return index;
                }
                map.put(nums[i],i);
        }
        return index;
    }
}
