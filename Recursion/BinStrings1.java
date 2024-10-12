package Recursion;

public class BinStrings1 {
    //not consecutive zeros
    public static void binStrings1(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        binStrings1(n-1,1, str+"1");
        if(lastPlace ==1){
            binStrings1(n-1,0, str+"0");
        }
    }

    public static void main(String[] args) {
        binStrings1(3,0, " ");
    }
}
