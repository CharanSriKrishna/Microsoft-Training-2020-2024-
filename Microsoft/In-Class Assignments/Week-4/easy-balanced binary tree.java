class Solution {
    int unbal=-1;
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        return dept(root)!=unbal;
    }
    private int dept(TreeNode root){
        if(root.left==null && root.right==null)return 1;
        int left=0;
        int right=0;
        if (root.left!=null){
            left=dept(root.left);
        }
        if(left==unbal) return unbal;
        if(root.right!=null){
            right=dept(root.right);
        }
        if(right==unbal) return unbal;
        if(Math.abs(left-right)<=1)return Math.max(left,right)+1;
        return unbal;
    }
}
