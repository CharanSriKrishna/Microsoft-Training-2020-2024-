class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow=head;
        //ListNode slow2=slow;
        ListNode fast =head;
        while(fast!=null){
            if(slow.val!=fast.val){
                slow.next=fast;
                slow=slow.next;
            }
            fast=fast.next;
            if(fast==null){
                slow.next=null;
            }
        }
        return head;
    }
}
