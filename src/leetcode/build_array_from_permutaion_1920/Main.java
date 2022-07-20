package leetcode.build_array_from_permutaion_1920;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = new int[6];
        input[0] = 0;
        input[1] = 2;
        input[2] = 1;
        input[3] = 5;
        input[4] = 3;
        input[5] = 4;

        System.out.println(Arrays.toString(Arrays.stream(buildArray(input)).toArray()));
     }

    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i =0 ; i< nums.length ; i++){
            int n = nums[i];

            res[i] = nums[n];
        }

        return res;
    }
}
