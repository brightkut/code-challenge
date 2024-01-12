
package leetcode.two_pointer.two_sum_problem.three_sum_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int [] nums = {34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,-66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49
//};
//        System.out.println(threeSum(nums));
        //-82 -70 -66 -49 -43 -29 -29 -14 -11 -6 -3 -3 1 2 10 12 13 15 15 17 21 26 26 28 28 29 31 33 34 36 43 46 46 47 48 49 52 55 55 56 57 61 62 65 69 71 74 76 77 79 83 84 86 93 94
        int [] nums2 = {-1,0,1,2,-1,-4};
        int [] nums3 = {-2,0,0,2,2};
        //[-2,0,0,2,2]
        //[-2,0,1,1,2]
        System.out.println(threeSum2(nums2));
        System.out.println(threeSum2(nums3));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        //sort the array for check duplicate value
        Arrays.sort(nums);
        for(int j =0;j< nums.length;j++){
            System.out.printf(nums[j]+" ");
        }

        int x = nums[0];
        for(int i=0; i<nums.length; i++){

            //ignore duplicate value in second round
            if(i > 0 && x == nums[i-1]){
                System.out.println("skip");
                x=nums[i+1];
                continue;
            }

            int l = i+1 , r = nums.length-1;


            while (l<r){
                int thrSum = x + nums[l] + nums[r];

                System.out.println("x: "+x+" y: "+nums[l]+" z: "+nums[r]);
                List<Integer> triplet = new  ArrayList<>();
                 if(thrSum > 0){
                    //shift right pointer to left
                    r-=1;
                }else if(thrSum <0) {
                    //shift left pointer to right
                    l+=1;
                }else{
                     triplet.add(x);
                     triplet.add(nums[l]);
                     triplet.add(nums[r]);
                     res.add(triplet);
                     //shift left pointer to right
                     l+=1;
                     while(nums[l] == nums[l-1] && l<r){
                         l+=1;
                     }
                 }
            }

            if(i< nums.length-1) x=nums[i+1];
        }

        return res;
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        // [-4,-1,-1,0,1,2]
        // 1. case length < 3 return empty
        // 2. sort array
        // 3. we have 2 part (1 is fix that will traverse from left to right) (2 is sub array that we will use two pointer)


        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));

        HashSet<Integer> h = new HashSet<>();

        for(int i =0 ; i< nums.length; i++){
            int l = i +1 , r = nums.length-1;

            if(!h.contains(nums[i])) {
                HashSet<Integer> h2 = new HashSet<>();
                while (l<r){
                    int sum = nums[i] + nums[l] + nums[r];
                    if(sum == 0 && (!h2.contains(nums[l])|| !h2.contains(nums[r]) )) {
                        List<Integer> s = new ArrayList<>();
                        s.add(nums[i]);
                        s.add(nums[l]);
                        s.add(nums[r]);
                        res.add(s);
                        h2.add(nums[l]);
                        h2.add(nums[r]);
                        l++;
                        r--;
                    }else if(sum < 0){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
            h.add(nums[i]);
        }

        return res;
    }


}
