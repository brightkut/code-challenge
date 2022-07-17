package leetcode.maximum_sub_array_53;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(maxSubArray(nums));

        System.out.println(maxSubArrayDivideAndConquer(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];

            max= Math.max(sum,max);
            if(sum<=0) sum=0;

        }
        return max;
    }

    public static int maxSubArrayDivideAndConquer(int[] nums){
        return  maximumSubArray(nums,0,nums.length-1);
    }

    public static int maximumCrossArray(int[] nums , int lowIndex,int middleIndex, int highIndex){
        int sum = Integer.MIN_VALUE;
        int s = 0;

        for(int i =middleIndex; i>=lowIndex; i--){
            s+= nums[i];

            if(s>sum) sum = s;
        }

        int sums2 = Integer.MIN_VALUE;
        int s2 = 0;


        for(int j= middleIndex+1;j<=highIndex;j++){
            s2+=nums[j];

            if(s2>sums2) sums2 = s2;
        }

        return Math.max(sum+sums2,Math.max(sum,sums2));
    }

    public static int maximumSubArray(int [] nums , int lowIndex , int highIndex){
        if(lowIndex == highIndex){
            return nums[lowIndex];
        }

        int middleIndex = (lowIndex+highIndex)/2;

        return Math.max(
                Math.max(
                        maximumSubArray(nums,lowIndex,middleIndex),
                        maximumSubArray(nums,middleIndex+1,highIndex)
                )
                ,maximumCrossArray(nums,lowIndex,middleIndex,highIndex));
    }
}
