class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack <TreeNode>stack=new Stack();
        double left_child=-Double.MAX_VALUE;

        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }

            root=stack.pop();
            if(root.val<=left_child)return false;
            left_child=root.val;
            root=root.right;
        }
        return true;
    }
}
