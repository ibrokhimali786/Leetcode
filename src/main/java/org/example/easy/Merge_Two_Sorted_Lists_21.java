package org.example.easy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class Merge_Two_Sorted_Lists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode first = new ListNode();
        ListNode current = first;

        while (l1 != null || l2 != null) {

            int n1 = 101, n2 = 101;

            if (l1 != null) n1 = l1.val;
            if (l2 != null) n2 = l2.val;

            if (n2 < n1) {
                current.next = new ListNode(n2);
                l2 = l2.next;
            } else {
                current.next = new ListNode(n1);
                l1 = l1.next;
            }

            current = current.next;
        }

        return first.next;
    }
}
