class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res =new ListNode(0);
        ListNode curr =res;
        int carry=0;

        while(l1 !=null || l2 !=null || carry !=0){
            int sum=(l1==null?0:l1.val)+(l2==null?0:l2.val)+carry;
            ListNode newNode= new ListNode(sum%10);
            carry=sum/10;

            curr.next=newNode;
            curr=curr.next;
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;

        }
        return res.next;
    }
}