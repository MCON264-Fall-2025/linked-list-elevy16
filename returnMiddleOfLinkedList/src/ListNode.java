import org.w3c.dom.Node;

public class ListNode {

    // fields
    int val; // the data value
    ListNode next; // pointer to the next node in the list

    // constructor
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public static ListNode findMiddleNode(ListNode head) {

        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // move slow by 1 and fast by 2 until fast reaches the end
        while(fast != null && fast.next != null) // handles odd and even parity
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow now points to the middle node
    }
}
