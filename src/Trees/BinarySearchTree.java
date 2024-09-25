// sample usage of BinarySearchTree
package Trees;


public class BinarySearchTree {
    public static class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }
    private Node root;
    
    public BinarySearchTree(){
        
    }

    public int height(Node root){
        if(root == null){
            return -1;
        }
        return root.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root, "Root Node: ");
    }
    private void display(Node root, String details){
        if(root == null){
            return;
        }
        System.out.println(details + root.val);
        display(root.left, "Left of " + root.val + " : ");
        display(root.right, "Right of " + root.val + " : ");
    } 
}
