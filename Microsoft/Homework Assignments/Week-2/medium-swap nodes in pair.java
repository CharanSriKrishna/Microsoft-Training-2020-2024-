class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode nn=new ListNode(0);
        nn.next=head;
        ListNode a1=nn;
        ListNode a2=head;
        while(a2!=null && a2.next!=null){
            a1.next = a2.next;
            a2.next = a2.next.next;
            a1.next.next = a2;
            
            a1 = a2;
            a2 = a2.next;
            
        }
        return nn.next;
    }
}
