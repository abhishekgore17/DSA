package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n){
        if(n==0 || n ==1){
            return 1;
        }
        //vertical
        int Fnm1 = tilingProblem(n-1);

        //horizontal
        int Fnm2 = tilingProblem(n-2);

        int totalWays = Fnm1 + Fnm2;
        return totalWays;

    }
    public static void main(String[] args) {
System.out.println(tilingProblem(3));
    }
}
