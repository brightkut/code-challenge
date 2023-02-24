package leetcode.two_pointer.intersect_two_array_349;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        HashSet<Integer> h = new HashSet<>();

//        System.out.println(Arrays.toString(intersection(nums1,nums2)));
//        System.out.println(Arrays.toString(intersection(nums3,nums4)));
//        System.out.println(Arrays.toString(intersection2(nums1,nums2)));
        System.out.println(Arrays.toString(intersection2(nums3,nums4)));
    }

    //Hash Table
    public static int[] intersection(int[] nums1, int[] nums2) {
        int [] longArr = nums1;
        int [] smallArr = nums2;

        if(nums1.length < nums2.length){
            longArr = nums2;
            smallArr = nums1;
        }

        //value,count
        HashSet<Integer> h = new HashSet<>();

        //add to hashmap
        for(int n: longArr) h.add(n);

        Set<Integer>r = new HashSet<>();

        for(int j: smallArr){
            if(h.contains(j)) r.add(j);
        }

        int [] res = new int[r.size()];

        int c = 0;
        for(Integer i : r) res[c++] =i;

        return res;
    }

    //Two pointer
    public static int[] intersection2(int[] nums1, int[] nums2) {
        int [] longArr = nums1;
        int [] smallArr = nums2;

        if(nums1.length < nums2.length){
            longArr = nums2;
            smallArr = nums1;
        }

        Arrays.sort(longArr);
        Arrays.sort(smallArr);

        Set<Integer> r = new HashSet<>();

        int left = 0;
        int right = 0;

        //4,9

        //[4,4,8,9,9]
        //[4,5,9]
        while (right<=smallArr.length-1 && left<= longArr.length-1){
            if(longArr[left] == smallArr[right]){
                r.add(smallArr[right]);
                right++;
            }else if(longArr[left] > smallArr[right]){
                right++;
            }else {
                left++;
            }
        }

        int [] res = new int[r.size()];
        int c = 0;
        for(Integer i : r) res[c++] =i;

        return res;
    }
}
