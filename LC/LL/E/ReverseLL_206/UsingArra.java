import java.util.ArrayList;

public class UsingArra {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseListUsingArray(ListNode head) {
        if (head == null) return null;

        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = temp.next;
        }

        for (int i = nodes.size() - 1; i > 0; i--) {
            nodes.get(i).next = nodes.get(i - 1);
        }

        nodes.get(0).next = null; // Last node points to null
        return nodes.get(nodes.size() - 1); // New head
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

        node1 = reverseListUsingArray(node1); // Update head after reversal

        System.out.print("Reversed List (Using Array): ");
        printList(node1);
    }
}
