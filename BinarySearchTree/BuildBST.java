package BinarySearchTree;

public class BuildBST {
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

    public static void inorder(Node root){
        //base case
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
    }
}
