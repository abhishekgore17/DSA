package Array;
import java.util.Scanner;

public class basicArray {
    public static void main(String[] arg){
        int marks[] = new int[50];
        System.out.println("Enter the marks of the subject :");
        Scanner sc= new Scanner(System.in);
        marks[0]= sc.nextInt();//phy
        marks[1]= sc.nextInt();//chem
        marks[2]= sc.nextInt();//math

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("math: " + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage is : "+ percentage +"%");


    }
}
