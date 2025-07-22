package BinarySearchTree;

public class PrintInRange {
    static class Node{
            int data;
            Node left , right;

            public Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
    }

    public static Node insert(Node root, int val){
        if(root == null){ //Root are null then, create new node
            root = new Node(val);
            return root;
        }

        //root are not null then, find out the correct position.
        if(root.data > val){
            // left Subtree
            root.left = insert(root.left, val);
        } else{
            //right Subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        //base case
        if(root == null){
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        }
        else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        printInRange(root, 5, 12);

    }
}
