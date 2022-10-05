public class Solution {
    public ListNode detectCycle(ListNode head) {
        //if(head==null || head.next==null)return head;
        ListNode start=head,slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(start!=slow){
                    start=start.next;
                    slow=slow.next;
                }
                return start;
            }
        }
        return null;
    }
}
