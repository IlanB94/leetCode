
public class RemoveElementsFromLinkedList {
	public static ListNode removeElements(ListNode head, int value) {

		// check if the first node equal to value
		while (head != null && head.val == value) {
			head = head.next;
		}
		if (head == null) {
			return head;
		}
		ListNode current = head;
		ListNode temp = current.next;

		while (temp != null) {
			if (temp.val == value) {
				current.next = current.next.next;
				temp = temp.next.next;
			} else {
				current = current.next;
				temp = temp.next;
			}
		}
		return head;
	}
}
