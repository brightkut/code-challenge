package leetcode.remove_element_27;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] input = {3,2,2,3};

        System.out.println(removeElement(input,3));
        System.out.println(Arrays.toString(input));
    }

    public static int removeElement(int[] nums, int val) {
        int countVal = 0;

        for(int j=0 ; j<nums.length; j++){
            if(nums[j]!=val){
                nums[countVal] = nums[j];
                countVal++;
            }
        }
        return countVal;
    }
}
