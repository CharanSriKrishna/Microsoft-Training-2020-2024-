class Solution {
    public ListNode merge(ListNode a1,ListNode a2){
        if(a1==null) return a2;
        if(a2==null) return a1;
        if(a1.val<a2.val){
          a1.next=merge(a1.next,a2);
          return a1;
        }
        else{
           a2.next=merge(a1,a2.next);
            return a2;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if(k==0)return null;
        int val=1;
        while(true){
        boolean a=true;
        for(int i=0;i+val<k;i+=val*2){
            lists[i]=merge(lists[i],lists[i+val]);
            a=false;
        }
        val*=2;
        if(a==true){
            break;
        }
        }
        return lists[0];
    }
}
