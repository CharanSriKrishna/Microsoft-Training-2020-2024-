class Solution {
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root,root);
    }
    public boolean ismirror(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        if(t1==null || t2==null)return false;
        return (t1.val==t2.val)&& ismirror(t1.left,t2.right)&& ismirror(t1.right,t2.left);
    }
}
