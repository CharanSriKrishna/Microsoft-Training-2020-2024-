class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        change(root);
        return root;
    }
    public void change(TreeNode root){
        if(root==null)return ;
        TreeNode tem=root.left;
        root.left=root.right;
        root.right=tem;
        change(root.left);
        change(root.right);
    }
}
