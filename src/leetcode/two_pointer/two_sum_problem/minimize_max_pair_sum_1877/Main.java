package leetcode.two_pointer.two_sum_problem.minimize_max_pair_sum_1877;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] n = {3,5,2,3};
        int [] n2 = {3,5,4,2,4,6};

        System.out.println(minPairSum(n));
        System.out.println(minPairSum(n2));
    }

    public static int minPairSum(int[] nums) {

        Arrays.sort(nums);

        int left = 0 , right = nums.length - 1;

        int max = Integer.MIN_VALUE;

        while (left < right){

            int sum = nums[left] + nums[right];
            max = Math.max(max,sum);
            left++;
            right--;
        }

        return max;
    }
}
