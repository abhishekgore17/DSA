package FunctionMethod;
import patternprograms.AdvancedPattern;

import java.util.*;

    public class Addition {
        static class Node{

        }
        public static int CalculateSum(int num1, int num2){
            int sum = num1 + num2;
            return sum;

        }

        public static void main(String[] arg){
            Scanner sc = new Scanner(System.in);
            AdvancedPattern t = new AdvancedPattern();

            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = CalculateSum(a,b);
            System.out.println("Sum is : "+ sum);
        }
    }
