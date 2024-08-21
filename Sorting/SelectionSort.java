package Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<arr.length-1; j++){
                if(minPos > arr[j]){
                    minPos = j;
                }
            }
            //Swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        selectionSort(arr);
        printArray(arr);
    }
}
