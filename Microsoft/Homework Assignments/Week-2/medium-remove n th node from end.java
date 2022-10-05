class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode samp=dummy;
        ListNode samp1=dummy;
        int k=0;
        while(samp!=null){
            k++;
            samp=samp.next;
        }
        int m=k-n;
        int j=1;
        while(j<m){
            samp1=samp1.next;
            j++;
        }
        samp1.next=samp1.next.next;
        return dummy.next;
    }
}

