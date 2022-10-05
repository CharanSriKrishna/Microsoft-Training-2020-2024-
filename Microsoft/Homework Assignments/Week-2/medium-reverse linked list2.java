class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return head;
        }
        ListNode ptr1=new ListNode(0);
        ptr1.next=head;
        ListNode ptr=ptr1;
        int k=1;
        while(ptr!=null && k<left){
            ptr=ptr.next;
            k++;
        }
        ListNode start=ptr;
        ptr=ptr.next;
        ListNode prev=null;
       // ListNode curr=head;
        while(k<=right){
            ListNode next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
            k++;
        }
        start.next.next=ptr;
        start.next=prev;
        return ptr1.next;
    }
}
