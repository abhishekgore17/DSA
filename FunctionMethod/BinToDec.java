package FunctionMethod;



public class BinToDec {
    public static void binaryToDec(int binNum) {
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of " + binNum + "  =  " + decNum);
    }

    public static void main(String[] args) {
        binaryToDec(1010);
    }
}


