public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; 
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;

        // Traverse both lists until both are null
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; 


            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummy.next; 
    }
