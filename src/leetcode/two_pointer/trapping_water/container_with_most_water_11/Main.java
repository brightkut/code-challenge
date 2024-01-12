package leetcode.two_pointer.trapping_water.container_with_most_water_11;

public class Main {
    public static void main(String[] args) {
        int [] n = {1,8,6,2,5,4,8,3,7};
        int [] n2 = {1,1};

        System.out.println(maxArea(n));
        System.out.println(maxArea(n2));
    }
    public static int maxArea(int[] height) {
        // 1. we will use the lowest height between 2 height
        // 2. calculate area if it more than max then update
        // 3. shift pointer depend on lowest height will be shifted

        int l = 0 , r = height.length - 1;

        int maxArea = -1;

        while (l < r){
            int area = Math.min(height[l], height[r]) * (r-l);

            maxArea = Math.max(maxArea,area);

            if(height[l] <= height[r]){
                l++;
            }else {
                r--;
            }
        }

        return maxArea;
    }
}
