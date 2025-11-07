//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create odd length linked list
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        ListNode middle = ListNode.findMiddleNode(list1);
        System.out.println("Middle of list 1: " + middle.val); // expected: 3

        // create even length linked list
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);
        list2.next.next.next.next = new ListNode(5);
        list2.next.next.next.next.next = new ListNode(6);

        middle = ListNode.findMiddleNode(list2);
        System.out.println("Middle of list 2: " + middle.val);
    }
}