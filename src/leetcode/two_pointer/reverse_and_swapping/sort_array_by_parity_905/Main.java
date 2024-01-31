package leetcode.two_pointer.reverse_and_swapping.sort_array_by_parity_905;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(input)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int [] res = new int[nums.length];
        int l = 0 , r = nums.length - 1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                res[l] = nums[i];
                l++;
            }else {
                res[r] = nums[i];
                r--;
            }
        }

        return res;
    }
}
