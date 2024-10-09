package Recursion;

public class Fibonacci {
    public static int fibonacci(int n ){
        if(n==0 || n==1){
            return n ;
        }
        int Fnm1 = fibonacci(n-1);
        int Fnm2 = fibonacci(n-2);
        int Fn = Fnm1 + Fnm2 ;
        return Fn ;
    }
    public static void main(String[] args) {
        int n = 26;
        System.out.println(fibonacci(n));
    }
}
