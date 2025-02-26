/*
 * head is a reference to the first node of the linked list.
Inside the while loop, you update head = head.next, which moves head forward.
But this only changes the local copy of the reference inside the method.
The original linked list in the caller function remains unchanged.
*/

import java.util.List;

public class Optimal {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val, ListNode next){
            this.val=val;
            this.next = next;
        }
    }

    private ListNode head;

    public void insertFirst(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public int getDecimalValue(){ // using bit operator is more efficient
        int ans =0;
        ListNode temp = head;
        while(temp != null){
            ans = ans << 1;       // Left shift (multiply by 2)
            ans = ans | temp.val; // Bitwise OR (add the current bit)
            temp = temp.next;
        }
        return ans;
    }

    public void printList(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args){
        Optimal list = new Optimal();

        list.insertFirst(1);
        list.insertFirst(0);
        list.insertFirst(1);

        list.printList();

        System.out.println("Decimal Value: " + list.getDecimalValue());
    }
}
