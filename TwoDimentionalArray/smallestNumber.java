package TwoDimentionalArray;
import java.util.Scanner;

public class smallestNumber {
    public static void SmallestNumber(int[][] matrix) {
        int n = 3;
        int m = 3;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.print("smallest number in the matrix is : "+ smallest);
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.print("Enter the element : ");
        for(int i=0;i<n ; i++){
            for(int j =0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        SmallestNumber(matrix );
    }
}
