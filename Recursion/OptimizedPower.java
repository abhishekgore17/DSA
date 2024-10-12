package Recursion;

public class OptimizedPower {
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        //for even
        int halfPow = optimizedPower(a, n/2);
        int halfPowSq = halfPow * halfPow;

        //for odd
        if(n%2!=0){
            halfPowSq = a *  halfPowSq;
        }
        return  halfPowSq;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 4;
        System.out.println(optimizedPower(a,n));
    }
}
