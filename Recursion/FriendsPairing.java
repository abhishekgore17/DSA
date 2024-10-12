package Recursion;

public class FriendsPairing {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        /*//choice for single
        int Fnm1 = friendsPairing(n-1);

        //choice for pair
        int Fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * Fnm2;

        //TotalWays
        int totWays = Fnm1 + pairWays;

        return totWays;*/

        //OR
        return friendsPairing(n-1) +(n-1)*friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));

    }
}
