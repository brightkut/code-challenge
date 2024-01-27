package leetcode.backtracking.permutation_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] input = {1,2,3};

//        int [] s = Arrays.copyOfRange(input,1, input.length);
//        int [] s2 = Arrays.copyOfRange(input,1, input.length-1);
//        printArray(s);
//        System.out.println();
//        printArray(s2);

        System.out.println(permutation2(input));

    }

    public static void printArray(int[] n){
        for(int i =0 ; i< n.length ; i++) System.out.print(n[i]+ " ");
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

    public static List<List<Integer>> permutation2(int[] nums){
        if(nums.length == 0 ){
            List<Integer> l = new ArrayList<>();
            List<List<Integer>> res = new ArrayList<>();
            res.add(l);
            return res;
        }

        int firtElement = nums[0];
        int[] restElement = Arrays.copyOfRange(nums,1,nums.length);

        List<List<Integer>> permutationWithoutFirstElement = permute(restElement);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0 ;  i < permutationWithoutFirstElement.size() ; i++){
            List<Integer> perm = permutationWithoutFirstElement.get(i);

            for(int j = 0 ; j <=  perm.size(); j++){
                List<Integer> r = new ArrayList<>();
                r.addAll(perm.subList(0,j));
                r.add(firtElement);
                r.addAll(perm.subList(j,perm.size()));
                res.add(r);
            }
        }

        return res;
    }
}
