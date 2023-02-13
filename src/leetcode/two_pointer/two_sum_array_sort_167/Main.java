package leetcode.two_pointer.two_sum_array_sort_167;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // TC1
        int [] numbers1 = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers1, target)));
        //TC2
        int [] numbers2 = {2,3,4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(numbers2, target2)));
        //TC3
        int [] numbers3 = {-1,0};
        int target3 = -1;
        System.out.println(Arrays.toString(twoSum(numbers3, target3)));
    }

    //Two pointer
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0 , right = numbers.length-1;

        while (left<right){
            int sum = numbers[left] + numbers[right];

            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else {
                int [] res = new int[2];
                res[0] = left+1;
                res[1] = right+1;

                return  res;
            }
        }
        return null;
    }
}
