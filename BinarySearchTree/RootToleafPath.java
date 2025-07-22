package BinarySearchTree;

import java.util.ArrayList;

public class RootToleafPath {
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

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0; i< path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void rootToLeaf(Node root, ArrayList<Integer> path){
        //base case
        if(root == null){
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }

        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        rootToLeaf(root, new ArrayList<>());
    }
}
