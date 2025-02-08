package LinkedList;

public class S_LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {//constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2 = newNode.next = head;
        newNode.next = head;

        //step 3 = head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 : create a node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        }
        //step 2 :
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Example 01 : Using Iterative method Search for the KEY in LinkedList,If found then print position otherwise print -1.
    public int itrSearch(int key) {
        S_LinkedList.Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {//key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;

    }

    //Example 02 : Using Recursive method Search for the KEY in LinkedList,If found then print position otherwise print -1.
    public int helper(Node head, int key){
        //not found
        if(head == null){
            return -1;
        }
        //found
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        //not found
        if(idx == -1){
            return -1;
        }
        return idx+1 ;
    }
    public int recSearch(int key){
        return helper(head, key);
    }


    //Example 03 : Reverse a LinkedList (Iterative Aprroach
    public void reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    //Example 04 : Find and Remove Nth node from END
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;//remove first
            return;
        }

        //sz-n
        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Example 05 : check if LL is a Palindrome
    public Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //find middle
        Node mid = findMidNode(head);

        //Reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check if equal
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    //Example 06 : Detect a loop/cycle in a LinkedList
    public  static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false; //cycle doesn't exist
    }


    //Example 07 : Remove a loop/Cycle in a LL
    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle =  true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle
        prev.next = null;
    }

    //Example 08 :zig-zag LinkedList
    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alternative merge- zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }


    public static void main(String[] args) {
        S_LinkedList ll = new S_LinkedList();
        //ll.addFirst(1);
        //ll.addFirst(2);
        //ll.addLast(1);
        //ll.addLast(2);
        //ll.addLast(2);
        //ll.addLast(1);
        //ll.add(2,3);
        //ll.print();
        //System.out.println( "Size of the Linked List is : " + ll.size);
        //ll.removeFirst();
       // ll.print();
       // ll.removeLast();
        //ll.print();

        //System.out.println(ll.itrSearch(3));
        //System.out.println(ll.itrSearch(10));
        //System.out.println(ll.recSearch(3));
        //System.out.println(ll.recSearch(10));
        //ll.deleteNthFromEnd(3);
        //ll.print();
        //ll.reverse();
        //ll.print();
        //System.out.println(ll.checkPalindrome());

//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        //1->2->3->1
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        //1->2->3->4->5->6

        ll.print();
        ll.zigzag();
        ll.print();




    }
}
