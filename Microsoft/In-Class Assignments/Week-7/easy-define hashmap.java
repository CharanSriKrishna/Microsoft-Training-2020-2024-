class MyHashMap {
    ArrayList<Node>[]has;
    public class Node{
        int key;
        int val;
        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }

    public MyHashMap() {
         has=new ArrayList[10001];
    }
    
    public void put(int key, int value) {
        Node nn=new Node(key,value);
        int ind=key/100;
        if(has[ind]==null){
            has[ind]=new ArrayList<Node>();
            has[ind].add(nn);
            return;
        }
        else{
            for(Node e:has[ind]){
                if(e.key==key){
                    e.val=value;
                    return;
                }
            }
            has[ind].add(nn);
        }
        //this.has[key].val=value;
    }
    
    public int get(int key) {
        /*if(this.has[key].val!=null){
            return this.has[key].val;
        }*/
        int ind=key/100;
        if(has[ind]==null){
            return -1;
        }
        for(Node e:has[ind]){
            if(e.key==key){
                return e.val;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int ind=key/100;
        if(has[ind]==null){
            return;
        }
        for(Node e:has[ind]){
            if(e.key==key){
                has[ind].remove(e);
                return;
            }
        }
    }
}
