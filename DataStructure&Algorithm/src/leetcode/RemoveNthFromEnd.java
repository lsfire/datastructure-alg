package leetcode;

public class RemoveNthFromEnd {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	       
	        ListNode tmp1 = new ListNode(0);
	        tmp1.next = head;
	        ListNode tmp  = tmp1;
	        for(int i = 0;i < n ;i++){
	            tmp1 = tmp1.next;
	        }
	        ListNode tmp2 = tmp;
	        while(tmp1.next!=null){
	            tmp1 = tmp1.next;
	            tmp2 = tmp2.next;
	        }
	       
	        tmp2.next =tmp2.next.next;
	        return tmp.next;
	    }

}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
	 }
