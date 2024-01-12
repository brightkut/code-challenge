package leetcode.two_pointer.two_sum_problem.two_sum_array_sort_167;

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

        System.out.println(Arrays.toString(twoSum2(numbers1, target)));
        System.out.println(Arrays.toString(twoSum2(numbers2, target2)));
        System.out.println(Arrays.toString(twoSum2(numbers3, target3)));
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
    public static int[] twoSum2(int[] numbers, int target) {
        // 1. have 2 pointer on left and right  if it equal return index of l and r
        // if not check sum if it higher than target we need to shift right to left because we have sort array that mean high value it in right side
        // if lower shift left to right

        int l = 0 , r = numbers.length -1;

        while (l<r){
            int n1 = numbers[l];
            int n2 = numbers[r];

            if(n1 + n2 == target){
                int [] result = new int[2];
                result[0] = l+1;
                result[1]  = r+1;
                return result;
            }else if(n1 + n2 > target){
                r--;
            }else {
                l++;
            }
        }

        return null;
    }
}
