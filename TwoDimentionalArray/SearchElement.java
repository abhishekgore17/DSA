package TwoDimentionalArray;
import java.util.Scanner;

public class SearchElement {
    public static boolean searchElement(int[][] matrix, int key) {
       // int n = 3;
       // int m = 3;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.print("Element are found at cell ("+ i + ","+ j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
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
        searchElement(matrix , 5);
    }
}
