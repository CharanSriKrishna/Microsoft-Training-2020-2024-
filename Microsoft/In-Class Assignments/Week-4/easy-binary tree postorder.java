class Solution {
    List a=new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return a;
    }
    private void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        dfs(root.right);
        a.add(root.val);
        
    }
}
