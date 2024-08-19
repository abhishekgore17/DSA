package Array;

import java.net.SocketOption;

public class largestNum {
    public static int getlargest(int number[]){
       int largest= Integer.MIN_VALUE;//-infinity
       for(int i=0;i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
       return largest;
    }
    public static void main(String[] arg){
        int number[] = {1,2,5,7,9,10,45};
        System.out.println("The largest value is :" + getlargest(number));


    }
}
