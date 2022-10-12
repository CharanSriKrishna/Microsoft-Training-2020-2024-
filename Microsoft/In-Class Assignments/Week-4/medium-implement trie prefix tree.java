class treenode{
    HashMap<Character,treenode> children=new HashMap();
    boolean iswrd=false;
}
class Trie {
    treenode root;
    public Trie() {
        root=new treenode();
    }
    
    public void insert(String word) {
        char []arr=word.toCharArray();
        treenode currnode=root;
        for (char curcar:arr){
            if(currnode.children.containsKey(curcar)==false){
                currnode.children.put(curcar,new treenode());
            }
            currnode=currnode.children.get(curcar);
        }
        currnode.iswrd=true;

    }
    
    public boolean search(String word) {
        char []arr=word.toCharArray();
        treenode currnode=root;
        for (char curcar:arr){
            if(currnode.children.containsKey(curcar)==false){
                return false;
            }
            currnode=currnode.children.get(curcar);
        }
        if(currnode.iswrd==true){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        char []arr=prefix.toCharArray();
        treenode currnode=root;
        for (char curcar:arr){
            if(currnode.children.containsKey(curcar)==false){
                return false;
            }
            currnode=currnode.children.get(curcar);
        }
        return true;
    }
}
