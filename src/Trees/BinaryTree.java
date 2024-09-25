package Trees;
import java.util.*;

public class BinaryTree {
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    // insert elements in binary tree
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node root){
        System.out.println("Do you want to enter left of" + root.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left node of " + root.val);
            int val = scanner.nextInt();
            root.left = new Node(val);
            populate(scanner, root.left);
        }
        System.out.println("Do you want to enter right of" + root.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right node of " + root.val);
            int val = scanner.nextInt();
            root.right = new Node(val);
            populate(scanner, root.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node root, String indent){
        if(root == null){
            return;
        }
        System.out.println(indent + root.val);
        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node root, int level){
        if(root == null){
            return;
        }
        prettyDisplay(root.right, level+1);
        for(int i=0;i<level;i++){
            System.out.print("\t");
        }
        System.out.println(root.val);
        prettyDisplay(root.left, level+1);
    }
}
