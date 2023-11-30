package leetcode.slide_window.max_consecutive_one_III_1004;

public class Main {

    //Example 1:
    //
    //Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    //Output: 6
    //Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    //Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
    //Example 2:
    //
    //Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
    //Output: 10
    //Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
    public static void main(String[] args) {

        int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int [] nums2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};

        System.out.println(longestOnes(nums,2));
        System.out.println(longestOnes(nums2,3));

    }


    //pass
    public  static int longestOnes(int[] nums, int k) {
        int maxSize = 0 ;
        int left = 0;
        int count = 0;

        for(int right = 0 ; right < nums.length; right++){
            if(nums[right] == 0) count++;

            while (count > k && left <= right){
                if(nums[left] == 0) count--;
                left++;
            }

            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }
}
