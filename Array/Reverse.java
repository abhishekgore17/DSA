package Array;

public class Reverse {
    public static void reverseArray(int numbers[]){
        int first =0;
        int last = numbers.length-1;

        //Swapping
        while(first< last){
            int temp =numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int numbers[]= {2,4,6,8,10,12,14};
        reverseArray(numbers);
        //for  print
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();

    }
}
