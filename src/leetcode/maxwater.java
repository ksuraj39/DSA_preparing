package leetcode;

public class maxwater {
    public static void main(String[] args) {
        int [] arr ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int maxWater = 0;
        int lf=0; // left number
        int rg= height.length-1; // right number
        while (lf<rg){
            int w  = rg-lf; // width
            int h = Math.min(height[lf],height[rg]);
            int area = w*h;
            maxWater = Math.max(maxWater,area);
            if (height[lf] < height[rg]) {
                lf++;
            } else {
                rg--;
            }
        }
        return maxWater;
    }
}
