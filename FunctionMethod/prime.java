public class prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;

    }
}
public static void main(String arg[]){
    System.out.println(prime.isPrime(5));
}
