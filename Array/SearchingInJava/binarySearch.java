package Array.SearchingInJava;

public class binarySearch {
    public static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;

            //comparision
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        int numbers[]= {2,4,6,8,10,12,14,16};
        int key= 16;
        System.out.println("Index for key is : " + binary(numbers,key));
    }
}
