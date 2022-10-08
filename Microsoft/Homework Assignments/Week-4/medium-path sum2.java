class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> nn=new ArrayList();
        helper(root,targetSum,nn,new ArrayList<Integer>());
        //System.out.println(a);
        return nn;
    }
    public void helper(TreeNode root,int sum,List<List<Integer>>paths,List<Integer>cur){
            if(root ==null)return;
            cur.add(root.val);
            if(root.left==null && root.right==null && sum-root.val==0){
                paths.add(cur);
                return;
            }
            helper(root.left,sum-root.val,paths,new ArrayList<Integer>(cur));
            helper(root.right,sum-root.val,paths,new ArrayList<Integer>(cur));
            return;
            

    }
}
