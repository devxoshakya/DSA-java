package Trees;

public class BST {
    public class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public int getValue(){
            return val;
        }
    }

    private Node root;

    public BST() {

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

    public void insert(int val){
        
    }
}
