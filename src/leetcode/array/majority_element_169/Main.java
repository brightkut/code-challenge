package leetcode.array.majority_element_169;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int [] input = {3,2,3};
        int [] input2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(input));
        System.out.println(majorityElement(input2));
    }

    public static int majorityElement(int[] nums) {
        int m = nums.length/2;

        //{value,index}
        HashMap<Integer,Integer>h = new HashMap<>();

        for(int i= 0 ; i< nums.length;i++){
            int c = h.getOrDefault(nums[i],0)+1;

            if(c>m) return nums[i];

            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }

        return 0;
    }
}
