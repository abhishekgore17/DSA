package Demo;

public class RainWater {
    public static int trappedRainWater(int[] height){
        int n= height-length;

       //calaculate left max boundry
        int leftMax[] =new int[n];
        leftMax[0] = height[0];
        for(int i = 0; i<n ; i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }

        //
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
    }

}
