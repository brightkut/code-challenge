package leetcode.merge_sort_array_88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }

    //pass
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //empty nums1
        if(m==0) nums1 = nums2;
        //empty nums2
        int j = 0;

        for(int i = 0; i<m+n; i++){
            if(i>=m){
                nums1[i] = nums2[j];
                j++;
            }
        }

        Arrays.sort(nums1);
    }
}
