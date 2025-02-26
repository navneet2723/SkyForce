/*
 * this uses temp variable which is completely unnecessar
 * in java object references is passed by value
*/

public class BFA {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}

        ListNode(int val){
            this.val = val;
        }

        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static int getDecimalValue(ListNode head){
        int sum =0;
        ListNode temp = head;
        while(temp != null){
            sum = sum*2 + temp.val;
            temp = temp.next;
        }
        
        return sum;
    }

    public static void main(String[] args){
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Decimal Value: " + getDecimalValue(node1));
    }
}
