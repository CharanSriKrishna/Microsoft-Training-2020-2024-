class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> cc = new ArrayList<>();
        if(root==null){
            return cc;
        }
        Queue <TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr=que.remove();
                cur.add(curr.val);
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
            }
            cc.add(cur);
        }
        return cc;
    }
}
