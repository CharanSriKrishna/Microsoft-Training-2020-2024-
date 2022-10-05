class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode ptr=l3;
        int z=0;
        while(true){
            int x;
            if(l1!=null && l2 !=null){
               x=l1.val+l2.val;
            }
            else if(l1==null){
                x=l2.val;
            }
            else{
                x=l1.val;
            }
            x=z+x;
            z=0;
            if(x>9){
               z=x/10;
               x=x%10;
            }
            l3.val=x;
            //System.out.println(l3.val);
            if(l1!=null){
            l1=l1.next;}
            if(l2!=null){
            l2=l2.next;}
            if(l1==null && l2==null){
                break;
            }
            l3.next=new ListNode();
            l3=l3.next;
        }
        if(z>0){
            l3.next= new ListNode(z);
        }
        return ptr;
    }

}
