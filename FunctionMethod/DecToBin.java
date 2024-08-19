package FunctionMethod;

public class DecToBin {
    public static void DecimalToBin(int n){
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum +(int) (rem * Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary Number is "+ " = "+binNum);
    }
    public static void main(String[] arg){
        DecimalToBin(8);;
    }
}
