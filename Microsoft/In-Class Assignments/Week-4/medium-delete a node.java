class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;
        root=helper(root,key);
        return root;
    }
    public TreeNode helper(TreeNode root,int key){
        if(root==null)return root;
        if(root.val>key){
            root.left=helper(root.left,key);
        }
        else if(root.val<key){
            root.right=helper(root.right,key);
        }
        else if(root.val==key){
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            root.val=findmin(root.left);
            root.left=helper(root.left,root.val);
        }
        return root;
        
    }
    public int findmin(TreeNode root){
        while(root.right!=null){
            root=root.right;
        }
        return root.val;
    }
}
