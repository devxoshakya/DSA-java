package Trees.SegmentTrees;

public class SegmentTrees {

    public static void main(String[] args) {
        int[] arr = {9,4,5,7,23,98,0,6};

        SegmentTrees tree = new SegmentTrees(arr);
        tree.display(tree.root);
    }
    private static class Node {
        int data;
        int start;
        int end;
        Node left;
        Node right;

        public Node( int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private Node root;

    public SegmentTrees(int[] arr) {
        this.root = construct(arr, 0, arr.length - 1);
    }

    private Node construct(int[] arr, int start, int end){
        if(start == end){
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = start + (end - start) / 2;
        node.left = this.construct(arr, start, mid);
        node.right = this.construct(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;

    } 

    private void display(Node node){
        if(node == null){
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(node.left == null ? "." : node.left.data);
        sb.append(" -> " + node.data + " <- ");
        sb.append(node.right == null ? "." : node.right.data);
        System.out.println(sb.toString());

        display(node.left);
        display(node.right);
    }

    public int query(int start, int end){
        return query(this.root, start, end);
    }

    private int query(Node node, int start, int end){
        if(node.start >= start && node.end <= end){
            return node.data;
        } else if(node.start > end || node.end < start){
            return 0;
        } else {
            return query(node.left, start, end) + query(node.right, start, end);
        }
    }

    public void update(int idx, int val){
        update(this.root, idx, val);
    }

    private void update(Node node, int idx, int val){
        if(node.start == idx && node.end == idx){
            node.data = val;
            return;
        }

        int mid = node.start + (node.end - node.start) / 2;
        if(idx <= mid){
            update(node.left, idx, val);
        } else {
            update(node.right, idx, val);
        }

        node.data = node.left.data + node.right.data;
    }

    
}
