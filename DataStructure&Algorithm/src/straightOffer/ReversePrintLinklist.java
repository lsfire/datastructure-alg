package straightOffer;

import leetcode.ListNode;

/**
 * 
 * @author lsfire
 *从尾到头输出一个链表
 */
public class ReversePrintLinklist {
	public static void ReversePrintList(ListNode node){
		if(null == node){
			return;
		}
		if(null == node.next){
			System.out.print(node.val);
		}else{
			ReversePrintList(node.next);
			System.out.print(node.val);
		}

	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(0);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		ReversePrintList(n1);
		
	}

}
