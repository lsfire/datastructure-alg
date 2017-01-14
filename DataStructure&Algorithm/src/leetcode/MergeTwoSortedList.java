package leetcode;

public class MergeTwoSortedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode result = mergeTwoLists(l1, l2);
		printList(result);
		
	}
	
	public static void printList(ListNode node) {
		while(null != node){
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1){
            return l2;
        }
        if(null == l2){
            return l1;
        }
        ListNode tmp1 = l1;
        ListNode tmp2 = l2;
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        
        while(!(null == tmp1 && null == tmp2)){
            if(null == tmp1){
                result.next = tmp2;
                break;
            }
            if(null == tmp2){
                result.next = tmp1;
                break;
            }
            if(tmp1.val <= tmp2.val){
                result.next = tmp1;
                tmp1 = tmp1.next;
            }else{
                result.next = tmp2;
                tmp2 = tmp2.next;
            }
            result = result.next;
        }
        return tmp.next;
	
	}
}

