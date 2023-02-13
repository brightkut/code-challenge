package leetcode.two_pointer.three_sum_closest_16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(input,target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];

        // sort for use two pointer
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length-2 ; i++){

            int left_pointer = i +1;
            int right_pointer = nums.length-1;

            while (left_pointer < right_pointer){
                int sums = nums[i] + nums[left_pointer] + nums[right_pointer];

                if(sums > target){
                    right_pointer--;
                }else {
                    left_pointer++;
                }

                if(Math.abs(sums-target) < Math.abs(res-target)){
                    res = sums;
                }
            }
        }

        return res;
    }
}
