package leetcode.slide_window.sub_array_product_less_than_k_713;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // nums = [10, 5, 2, 6], k = 100

        int[] nums = {10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));

        //nums = [1,2,3], k = 0
        int[] nums2 = {1,2,3};
        System.out.println(numSubarrayProductLessThanK(nums2, 0));

        //nums = [1,1,1], k = 2
        int[] nums3 = {1,1,1};
        System.out.println(numSubarrayProductLessThanK(nums3, 0));
    }


    // Invalid
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 0) return 0;

        int curr = 1;
        int left = 0, ans = 0;

        for(int right = 0 ; right < nums.length ; right++){
            curr*=nums[right];
            ans++;

            while (curr >= k){
                // remove element
                curr /= nums[left++];
            }
            ans+= right - left + 1;
        }

        return ans;
    }
}
