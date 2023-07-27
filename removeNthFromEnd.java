public static ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode newList = new ListNode(0);
	    newList.next = head;
		ListNode current = head;
		int length = 0;

		while (current != null) {
			length++;
			current = current.next;
		}

		length -= n;
		current = newList;

		while (length > 0) {
			length--;
			current = current.next;
		}

		current.next = current.next.next;

		return newList.next;
	}
