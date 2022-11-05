package leetcode.backtracking.permutation_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] input = {1,2,3};

        System.out.println(permute(input));

    }

    //Backtracking
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        HashSet<Integer> s = new HashSet<>();

        permutation(res,p,nums,s);

        return res;
    }

    //
    public static void permutation(List<List<Integer>> res,List<Integer> permutationList, int[] nums ,HashSet<Integer> set){
        // 3key for Backtrack algo
        // Goal  =  return permutation
        // Constraint = can't use same number
        // Choice = choose number when we go in backtrack

        //Goal
        if( permutationList.size() == nums.length){
            List<Integer> arr = new ArrayList<>(permutationList);
            res.add(arr);
            return;
        }

        for (int num : nums) {

            //Choice
            if (!set.contains(num)) {
                //walk in
                set.add(num);
                permutationList.add(num);

                //backtrack
                permutation(res, permutationList, nums, set);

                // walk back
                set.remove(num);
                permutationList.remove(permutationList.size()-1);
            }
        }

    }
}
