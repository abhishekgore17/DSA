package patternprograms;

public class HollowRectangle {
    public static void main(String arg[]){
        int n = 4;
        int m = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("* ");
                } else{
                    System.out.print( "  ");
                }
            }
            System.out.println( );
        }
    }
}
