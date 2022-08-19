package leetcode.array.minimum_size_subarray_sum_209;

public class Main {
    public static void main(String[] args) {

        int [] nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int curVal = 0;
        int c = 0;
        int min = Integer.MAX_VALUE;
        int p = 0;

        for (int i =0 ; i< nums.length;i++){
            curVal+=nums[i];
            c++;

            while (curVal>=target){
                min = Math.min(c,min);
                curVal -= nums[p];
                p++;
            }
        }

        return min == Integer.MAX_VALUE ?  0 : min;
    }
}
