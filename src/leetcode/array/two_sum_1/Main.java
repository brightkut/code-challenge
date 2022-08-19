package leetcode.array.two_sum_1;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] input = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(input, 9)));
        System.out.println(Arrays.toString(twoSums(input,9)));
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

    // not working because we sort
    public static int [] twoSums(int[]nums, int target){
        int l =0;
        int r = nums.length-1;

        //sort
        Arrays.sort(nums);

        while (l<r){
            int f = nums[l];
            int s = nums[r];
            int sum = f+s;

            if(sum< target){
                l+=1;
            }else if(sum>target){
                r-=1;
            }else{
                int [] res = new int[2];
                res[0] = l;
                res[1] = r;

                return res;
            }
        }

        return null;
    }
}
