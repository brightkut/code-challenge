package leetcode.two_pointer.slow_fast_pointer.cyclic_detection.find_duplicate_number_287;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = {1,3,4,2,2};
        int [] input2 = {3,1,3,4,2};

//        System.out.println(findDuplicate(input));
//        System.out.println(findDuplicate(input2));
        System.out.println(findDuplicate2(input));
        System.out.println(findDuplicate2(input2));
    }

    //sort
    public static int findDuplicate(int[] nums) {
        if(nums.length <= 1) return 0;

        Arrays.sort(nums);

        int j = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]==nums[j]) return nums[i];
            j++;
        }

        return 0;
    }

    //slow fast
    public static int findDuplicate2(int[] nums){
        int slow = nums[0];
        int fast = nums[0];
        slow = nums[slow];
        fast = nums[nums[fast]];

        while (slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = nums[0];

        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }

    public static int findDuplicate3(int [] nums){
        int slow = nums[0];
        int fast = nums[0];

        while (true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast){
                fast = nums[0];
                while (slow != fast){
                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }


    }
}
