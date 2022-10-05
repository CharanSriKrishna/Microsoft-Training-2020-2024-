class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 ==null) return list1;
        ListNode ptr=new ListNode(0);
        ListNode list3=ptr;
        while(true){
            if(list1 != null && list2 != null){
                if(list1.val<list2.val )
                {
                    ptr.next=list1;
                    ptr=ptr.next;
                    list1=list1.next;
                } 
                else{
                    ptr.next=list2;
                    ptr=ptr.next;
                    list2=list2.next;
                }
            }
            if(list1==null || list2==null){
                break;
            }
        }
        if(list1!=null){
                ptr.next=list1;
        }
        else if(list2!=null){
            ptr.next=list2;
        }
        return list3.next;
    }
}
