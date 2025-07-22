package BinarySearchTree;

public class DeleteNode {
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

    public static boolean search(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(root.data > key){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
           root.right =  delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{//voila : yahi kes jisko hame delete karna hai.
            //case 1 : Leaf Node
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 : Single child
            if(root.left == null){
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3 : Two child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
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
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;


        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

       root = delete(root, 1);
       System.out.println();

       inorder(root);

    }
}
