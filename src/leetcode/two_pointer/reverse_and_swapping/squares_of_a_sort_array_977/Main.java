package leetcode.two_pointer.reverse_and_swapping.squares_of_a_sort_array_977;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(input)));
    }

    public static int[] sortedSquares(int[] nums) {
        int [] res = new int[nums.length];
        int index = nums.length -1;
        // 1. we will always find the max value because the array already sort

        int l = 0 , r = nums.length -1 ;

        while (l <= r){
            int al = Math.abs(nums[l]);
            int ar = Math.abs(nums[r]);
            int vl = (int) Math.pow(al,2);
            int vr = (int) Math.pow(ar,2);

            if(vl <= vr){
                res[index] = vr;
                r--;
            }else {
                res[index] = vl;
                l++;
            }

            index--;
        }

        return res;
    }
}
