package leetcode.two_pointer.two_sum_problem.three_sum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        int [] input= {-1,0,1,2,-1,-4};
        System.out.println(threeSum(input));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();

        Arrays.sort(nums);

        for (int i =0 ;i < nums.length-2 ; i++){

            int left = i+1;
            int right = nums.length-1;

            while (left < right) {
                int sums = nums[i] + nums[left] + nums[right];
//                System.out.println(nums[i]+","+nums[left]+","+nums[right]);

                if(sums == 0){
                    List<Integer> r = new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[left]);
                    r.add(nums[right]);
                    res.add(r);
                    break;
                }else if(sums > 0){
                    right--;
                }else {
                    left++;
                }
            }
        }

        return res.stream().distinct().toList();
    }
}
