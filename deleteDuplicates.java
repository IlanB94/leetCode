public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;
		if(head == null) {
			return null;
		}
		while(head.next != null) {
			if(head.val == head.next.val) {
				head.next = head.next.next;
			}else {
				head = head.next;
			}
		}
		return result;
    }
