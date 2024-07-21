class ListNode {
    int val;
    dsa.week_15.minimal.ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

//SOLUTION
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode intersection = intersect(head);
        if(intersection == null) return null;
        ListNode start = head;
        while(start != intersection){
            intersection = intersection.next;
            start = start.next;
        }
        return start;
    }
    public ListNode intersect(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return slow;
        }
        return null;
    }
}