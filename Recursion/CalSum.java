package Recursion;

public class CalSum {
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calSum(n-1);
        int sn = n + snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n =10;
        System .out.println(calSum(n));
    }
}
