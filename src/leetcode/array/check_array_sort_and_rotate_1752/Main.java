package leetcode.array.check_array_sort_and_rotate_1752;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //[3,4,5,1,2]
        int[] input = {3,4,5,1,2};
        System.out.println(check(input));
        System.out.println(check2(input));
        //[2,1,3,4]
        int[] input2 = {2,1,3,4};
        System.out.println(check(input2));
        //[1,2,3]
        int[] input3 = {1,2,3};
        System.out.println(check(input3));
    }

    public static boolean check(int[] nums) {

        //Rotate
        int [] fix = new int[nums.length];
        boolean rotate = false;
        int m = Integer.MIN_VALUE;

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
         if(nums[i] >= m && !rotate){
            second.add(nums[i]);
         }else {
            rotate = true;
            first.add(nums[i]);
         }
         m = nums[i];
        }

        first.addAll(second);
        for(int k = 0 ; k < first.size() ; k++) fix [k] = first.get(k);

        //check sort
        int min = fix[0];

        for(int j = 1 ; j< fix.length ; j++) {
            if (fix[j] >=  min) min = fix[j];
            else return false;
        }

        return true;
    }

    public static boolean check2(int [] A){
        //3,4,5,1,2
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(i);
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }

}
