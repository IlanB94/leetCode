public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode pointer1 = list1;
		ListNode pointer2 = list2;
		ListNode list = new ListNode();
		ListNode head = list;
		
		while(pointer1 != null && pointer2 != null) {
			if(pointer1.val <= pointer2.val) {
				head.next = pointer1;
				pointer1 = pointer1.next;
			}else {
				head.next = pointer2;
				pointer2 = pointer2.next;
			}
			head = head.next;
		}
		if(pointer1 != null) {
			head.next = pointer1;
		}
		if(pointer2 != null) {
			head.next = pointer2;
		}
		return list.next;
	}
