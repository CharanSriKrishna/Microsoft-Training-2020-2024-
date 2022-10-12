class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<List<Integer>> ss=new Stack();
        boolean[]visited=new boolean[rooms.size()];
        visited[0]=true;
        ss.push(rooms.get(0));
        while(!ss.isEmpty()){
            List<Integer> ll=ss.pop();
            for(int i=0;i<ll.size();i++){
                if(visited[ll.get(i)]!=true){
                ss.push(rooms.get(ll.get(i)));
                visited[ll.get(i)]=true;}
            }
        }
        for(int i=0;i<rooms.size();i++){
            if(visited[i]!=true)return false;
        }
        return true;
    }
}
