package leetcode.two_pointer.reverse_and_swapping.sort_array_by_parity_II_922;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = {4,2,5,7};
        int [] input2 = {2,3};
        System.out.println(Arrays.toString(sortArrayByParityII(input)));
        System.out.println(Arrays.toString(sortArrayByParityII(input2)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0 , r = nums.length -1 ;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] %2 == 0){
                res[l] = nums[i];
                l+=2;
            }else {
                res[r] = nums[i];
                r-=2;
            }
        }

        return res;
    }
}
