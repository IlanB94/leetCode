//Description: 
//2 Add Two Numbers
//You are given two non-empty linked lists representing two non-negative integers.
//The digits are stored in reverse order, and each of their nodes contains a single digit.
//Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
public class addTwoNumbers {
	public static ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		int tooBig = 0;
		int reminder = 0;
		int saver = 0;
		boolean flag = false;
		ListNode temp = new ListNode();
		ListNode head = temp;
		while ((list1 != null) && (list2 != null)) {
			saver = list1.val + list2.val + reminder;
			if (saver >= 10) {
				if (flag) {
					temp.next = new ListNode((list1.val + list2.val + reminder) % 10);
					reminder = (list1.val + list2.val + reminder) / 10;
					list1 = list1.next;
					list2 = list2.next;
					temp = temp.next;

				} else {
					reminder = (list1.val + list2.val + reminder) / 10;
					temp.next = new ListNode((list1.val + list2.val) % 10);
					list1 = list1.next;
					list2 = list2.next;
					temp = temp.next;
					flag = true;
				}

			} else {
				temp.next = new ListNode(list1.val + list2.val + reminder);
				if (temp.val >= 10) {
					temp.val = (list1.val + list2.val) / 10;
					reminder = (list1.val + list2.val) - 10;
				} else {
					reminder = 0;
					list1 = list1.next;
					list2 = list2.next;
					temp = temp.next;
				}
			}
		}
		tooBig = 0;
		if (list1 == null && list2 != null) {
			while (list2 != null) {
				tooBig = list2.val + reminder;
				if (tooBig >= 10) {
					reminder = tooBig / 10;
					temp.next = new ListNode(tooBig % 10);
					list2 = list2.next;
					temp = temp.next;
				} else {
					temp.next = new ListNode(tooBig);
					list2 = list2.next;
					temp = temp.next;
					reminder = 0;
				}
			}
			if (reminder == 1) {
				temp.next = new ListNode(reminder);
			}
		} else if (list1 != null && list2 == null) {
			while (list1 != null) {
				tooBig = list1.val + reminder;
				if (list1.val + reminder >= 10) {
					list1.val = tooBig % 10;
					reminder = tooBig / 10;
					temp.next = new ListNode(list1.val);
					list1 = list1.next;
					temp = temp.next;
				} else {
					temp.next = new ListNode(list1.val + reminder);
					list1 = list1.next;
					temp = temp.next;
					reminder = 0;
				}
			}

		}
		if (reminder == 1) {
			temp.next = new ListNode(reminder);
		}

		return head.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
