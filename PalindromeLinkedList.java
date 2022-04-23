import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(1);
		
		l1.next = l2;
		l2.next=l3;
		l3.next=l4;
		System.out.println(isPalindrome(l1));

	}

	public static boolean isPalindrome(ListNode head) {
		ListNode current = head;
		Stack <Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		while(current != null) {
			stack.push(current.val);
			queue.add(current.val);
			current = current.next;
		}
		while(!stack.isEmpty()) {
			if(stack.pop() != queue.poll()) {
				return false;
			}
		}
		return true;
		
		
		
		
	}

}


