class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len=nums.length;
        return helper(nums,0,len-1);
        
    }
    public TreeNode helper(int[]nums,int st,int ed){
        while(st<=ed){
        int mid=st+(ed-st)/2;
        TreeNode nn=new TreeNode(nums[mid]);
        nn.left=helper(nums,st,mid-1);
        nn.right=helper(nums,mid+1,ed);
        return nn;}
        return null;

    }
}
