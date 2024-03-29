class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
       ListNode prev = null;
       ListNode pres = head;
       ListNode next = pres.next;
       while(pres != null){ 
       pres.next = prev;
       prev = pres;
       pres = next;
       if(next!=null){
       next = next.next;
       }
       head = prev;
       }
       return head;
}
}
