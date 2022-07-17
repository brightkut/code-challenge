package leetcode.remove_duplicate_from_sort_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] input = {1,1,1};

        System.out.println(removeDuplicates(input));
        System.out.println(Arrays.toString(input));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
