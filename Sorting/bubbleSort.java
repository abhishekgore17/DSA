package Sorting;

public class bubbleSort {
    public static void BubbleSort(int[] arr){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){

                //Swapping
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4,6};

        BubbleSort(arr);
        printArray(arr);
    }
}
