class Solution {
    List a=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return a;
    }
    private void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        a.add(root.val);
        dfs(root.right);
    }
}
