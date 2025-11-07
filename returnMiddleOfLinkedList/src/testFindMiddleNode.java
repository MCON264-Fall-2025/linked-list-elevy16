import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testFindMiddleNode {

    // Test 1: Odd-length list (normal case)
    @Test
    public void testOddLengthList() {
        // build linked list: 1 → 2 → 3 → 4 → 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        // call the method
        ListNode middle = ListNode.findMiddleNode(list1);

        // verify the result
        assertEquals(3, middle.val);
    }

    // Test 2: Even-length list (normal case)
    @Test
    public void testEvenLengthList() {
        // build linked list: 1 → 2 → 3 → 4 → 5 → 6
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = new ListNode(5);
        list2.next.next.next.next.next = new ListNode(6);

        // call the method
        ListNode middle = ListNode.findMiddleNode(list2);

        // verify the result (expect the SECOND middle = 4)
        assertEquals(4, middle.val);
    }

    // Test 3: Single-node list (edge case)
    @Test
    public void testSingleNodeList() {
        // Build list: 1
        ListNode list3 = new ListNode(1);

        // Run the method
        ListNode middle = ListNode.findMiddleNode(list3);

        // Verify result → expected 1
        assertEquals(1, middle.val);
        // Optionally, confirm it has no next node
        assertNull(middle.next);
    }

    // Test 4: Empty list (edge case)
    @Test
    public void testEmptyList() {
        // Build list: none (head is null)
        ListNode list4 = null;

        // Run the method
        ListNode middle = ListNode.findMiddleNode(list4);

        // Verify result → should be null (no nodes in list)
        assertNull(middle);
    }
}
