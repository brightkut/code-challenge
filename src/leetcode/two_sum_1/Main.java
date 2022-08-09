package leetcode.two_sum_1;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] input = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(input, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> c = new HashMap<>();

        for (int i=0; i<nums.length ; i++){
            int index = i;
            int value= nums[i];
            int rest = target - value;

            if (c.containsKey(rest)){
                int []n = new int[2];
                n[0] = c.get(rest);
                n[1] = index;
                return n;
            }

            c.put(value,i);
        }
        return null;
    }
}
