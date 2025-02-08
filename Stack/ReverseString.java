package Stack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while(idx < str.length()){ // push element in stack
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr = s.pop();//remove element in the stack one by one
            result.append(curr); //then add into result;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);

    }
}
