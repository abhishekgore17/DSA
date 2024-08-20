package Array.SubArrays;

public class maxSubarray {
    public static void MaxSubArraySum(int[] numbers){
        int currsum= 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; numbers.length > i; i++){
            for(int j=i;j<numbers.length;j++){
                currsum = 0;
                for(int k = i; k<numbers.length; k++){
                    currsum +=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        MaxSubArraySum(numbers);
    }
}
