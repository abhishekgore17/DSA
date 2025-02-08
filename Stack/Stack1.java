package Stack;

// Implementation of Stack using  ArrayList -

import java.util.ArrayList;

public class Stack1 {
    static class stack1{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return - 1;  //stack is empty
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1; //stack is empty
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        stack1 s = new stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
