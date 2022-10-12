class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        return helper(root,targetSum);
    }
    public boolean helper(TreeNode root,int sum){
        if(root==null)return false;
        if(root.left ==null && root.right==null && (sum-root.val)==0){
            return true;
        }
        return helper(root.left,sum-root.val)||helper(root.right,sum-root.val);
    }

}
