package Strings;

//using Lexicographic order
public class largestString {
    public static void main(String[] args) {
        String[] fruits = {"banana", "apple","mango"};

        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
