package patternprograms;

public class Pyramid {
    public static void main(String arg[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {//for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print( "*");
            }
            System.out.println( );
        }
    }
}
