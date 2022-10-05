class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode dummy=root;
        while(true){
            if(root.val>val){
                if(root.left!=null){
                root=root.left;}
                else {
                    root.left=new TreeNode(val); 
                    return dummy;}
            }
            else{
                if(root.right!=null){
                root=root.right;}
                else {
                    root.right=new TreeNode(val);
                    return dummy;}
            }
    }
}}
