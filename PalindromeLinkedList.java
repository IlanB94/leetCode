import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeLinkedList {
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


