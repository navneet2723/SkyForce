import java.util.*;
class BinaryTree{
    BinaryTree(){

    }

    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }
    

    private Node root;

    public void populate(Scanner sc){
        System.out.println("Enter root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of: "+node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter value to the left of: "+node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Do you want to enter right of: "+node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter value right of : "+node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(this.root,"");
    }
    public void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent+ "\t");
        display(node.right,indent + "\t");
    }

    // public void preetyDisplay(){
    //     preetyDisplay(this.root,"");
    // }
    // public void preetyDisplay(Node node,String indent){
    //     if(node == null){
    //         return;
    //     }
    //     System.out.print("--->");
    //     preetyDisplay(node.right,indent);
    //     System.out.println(node.value);
    //     System.out.print("--->");
    //     preetyDisplay(node.left,indent);
    //     System.out.println();
    // }

    public void preetyPrint(){
        preetyPrint(this.root,0);
    }
    public void preetyPrint(Node node, int level){
        if(node == null){
            return;
        }
        preetyPrint(node.right, level+1);
        if(level != 0){
            for(int i =0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+node.value);
        }else{
            System.out.println(node.value);
        }
        preetyPrint(node.left,level+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(sc);
        bt.display();
        //bt.preetyDisplay();
        bt.preetyPrint();
    }
}