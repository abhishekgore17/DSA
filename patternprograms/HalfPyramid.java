package patternprograms;

public class HalfPyramid {
    public static void main(String arg[]){
        int n= 4;
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
