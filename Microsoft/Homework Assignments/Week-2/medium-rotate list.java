class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int ctr=1;
        if(head==null || head.next==null)return head;
        ListNode dummy=head;
        while(dummy.next!=null){
            ctr++;
            dummy=dummy.next;
        }
        dummy.next=head;
        dummy=head;
        ListNode dummy2=head;
        k=ctr-(k%ctr);
        ctr=0;
        while(ctr<k-1){
            dummy=dummy.next;
            ctr++;
        }
        dummy2=dummy.next;
        dummy.next=null;
        return dummy2;
    }
}
