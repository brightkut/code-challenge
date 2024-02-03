package leetcode.two_pointer.reverse_and_swapping.pancake_sorting_969;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {3,2,4,1};
        System.out.println(pancakeSort(input));
    }

    public static List<Integer> pancakeSort(int[] arr) {
        // find the max index of array
        // if max is in last index shift right pointer
        // if not  flip the array since that index found max value
        // flip entire array until right pointer
        int r = arr.length -1 ;

        List<Integer> res = new ArrayList<>();
        while (r >=0){
            int [] sliceArr = Arrays.copyOfRange(arr,0, r + 1);
            int maxIndex = maxValueIndex(sliceArr);

            if (maxIndex != r) {
                if(maxIndex != 0) {
                    flip(sliceArr, maxIndex);
                    res.add(maxIndex+1);
                }

                flip(sliceArr, r);
                res.add(r+1);
                arr = sliceArr;
            }
            r--;
        }

        return res;
    }

    public static int maxValueIndex(int [] nums){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0 ; i < nums.length; i++)
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }

        return index;
    }

    public static void flip(int [] nums, int size){
        int l = 0 , r = size;

        while (l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
