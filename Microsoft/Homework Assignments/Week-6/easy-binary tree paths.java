class Solution {
    List<String> ss;
    public List<String> binaryTreePaths(TreeNode root) {
        ss=new ArrayList();
        sss(root,"");
        return ss;
    }
    public void sss(TreeNode root,String s){
        if(root==null)return;
        if(root.left==null && root.right==null){
            s=s+root.val;
            ss.add(s);
            return;
        }
        sss(root.left,s+root.val+"->");
        sss(root.right,s+root.val+"->");
    }
}
