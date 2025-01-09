package DivedeAndConquer;

public class RotatedSearch {
    public static int rotatedSearch(int arr[], int tar, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei - si)/2;
        if(arr[mid]== tar){
            return mid;
        }
        // mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return rotatedSearch(arr, tar,si,mid-1);
            }else{
                //case b : right
                return rotatedSearch(arr, tar,mid+1,ei);
            }
        }
        //mid on L2
        else{
            //case c : right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return rotatedSearch(arr, tar,mid+1,ei);
            }else{
                //case d : left
                return rotatedSearch(arr, tar,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        System.out.println(rotatedSearch(arr, tar,0,arr.length-1));
    }
}
