

public class UsingRecursion {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Base case: If list is empty or has only one node
        }
        ListNode newHead = reverseListRecursive(head.next);
        head.next.next = head; // Reverse the pointer
        head.next = null; // Set the current node's next to null
        return newHead;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.print("Original List: ");
        printList(node1);

        node1 = reverseListRecursive(node1); // Update head after reversal

        System.out.print("Reversed List (Recursive): ");
        printList(node1);
    }
}
