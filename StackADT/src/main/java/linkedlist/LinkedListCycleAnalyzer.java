package linkedlist;

import support.CycleInfo;
import support.LLNode;

public class LinkedListCycleAnalyzer<T> {

    public static <T> CycleInfo detectCycleInfo(LLNode<T> head) {
        if (head == null) return new CycleInfo(-1, 0);

        // 1) Floyd's cycle detection
        LLNode<T> slow = head;
        LLNode<T> fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.getLink() != null) {
            slow = slow.getLink();
            fast = fast.getLink().getLink();
            if (slow == fast) {   // reference equality
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) return new CycleInfo(-1, 0);

        // 2) Measure cycle length
        int cycleLength = 1;
        LLNode<T> cur = slow.getLink();
        while (cur != slow) {
            cycleLength++;
            cur = cur.getLink();
        }

        // 3) Find entry index
        LLNode<T> p1 = head;
        LLNode<T> p2 = head;
        for (int i = 0; i < cycleLength; i++) {
            p2 = p2.getLink();
        }

        int entryIndex = 0;
        while (p1 != p2) {
            p1 = p1.getLink();
            p2 = p2.getLink();
            entryIndex++;
        }

        return new CycleInfo(entryIndex, cycleLength);
    }
}
