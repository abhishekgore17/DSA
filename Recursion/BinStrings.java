package Recursion;

public class BinStrings {

    //not consecutive ones
    public static void binStrings(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        binStrings(n-1,0, str+"0");
        if(lastPlace ==0){
            binStrings(n-1,1, str+"1");
        }
    }

    public static void main(String[] args) {
        binStrings(3,0, " ");
    }
}
