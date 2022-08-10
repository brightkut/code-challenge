package playground;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] n= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(n));
    }

    public static int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i =0; i< nums.length;i++){
            sum+=nums[i];

            max = Math.max(sum,max);
            if(sum<=0) sum = 0;

        }

        return max;
    }
}
