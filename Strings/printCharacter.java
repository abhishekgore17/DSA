package Strings;

import java.util.Scanner;

public class printCharacter {
    public static void printletter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "Abhishek";
        String lastName = "Gore";
        String fullName = firstName + " " + lastName;
        printletter(fullName);
    }
}

