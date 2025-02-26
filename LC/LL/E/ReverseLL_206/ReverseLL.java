/*
 * time complexity--O(n)
 * space complexity--O(1)
*/

// this can be solved using ARRAYLIST,STACK & RECURSION but with time complexity of --O(n)

public class ReverseLL {

    //private ListNode head;
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;

        while(current != null){
            nextNode = current.next;
            current.next  = prev;
            prev = current;
            current = nextNode;
        }
       
        return prev;
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
   

    public static  void main(String[] args){
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        printList(node1);

        node1=reverseList(node1);

        printList(node1);
        
    }
}
