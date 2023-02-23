package leetcode.array.intersect_two_arrray_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    int[]  nums1 = {1,2,2,1};
    int [] nums2 = {2,2};
//    System.out.println(intersect(nums1,nums2));
    System.out.println(intersect2(nums1,nums2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h = new HashMap<>();
        HashMap<Integer,Integer> h2 = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        //add to h1
        for(int i = 0 ; i< nums1.length ; i++){
            h.put(nums1[i],h.getOrDefault(nums1[i],0)+1);
        }

        //add to h2
        for(int j = 0 ; j< nums2.length ; j++){
            h2.put(nums2[j],h2.getOrDefault(nums2[j],0)+1);
        }

        for(int k : h.keySet()){
            if(h2.containsKey(k)){
                int cMin = Math.min(h.get(k),h2.get(k));
                for (int t= 0 ; t<cMin ; t++) res.add(k);
            }
        }

        int [] r = new int[res.size()];
        for(int l =0 ; l<res.size();l++){
            r[l] = res.get(l);
        }

        return r;
    }
    public static  int[] intersect2(int[] nums1, int[] nums2) {
        int [] n = nums2;
        int [] n2 = nums1;

        if (nums1.length < nums2.length) {
            n =  nums1;
            n2 = nums2;
        }

        Arrays.sort(n);
        Arrays.sort(n2);


        List<Integer>res = new ArrayList<>();

        int l = n2.length-1;
        int r = n.length -1;


        while( r >=0 ){
            if(l < 0 ){
                break;
            }
            if(n[r]==n2[l]){
                res.add(n[r]);
                r--;
                l--;
            }
        }

        int [] res2 = new int [res.size()];
        for(int j =0 ; j< res.size() ; j++){
            res2[j] = res.get(j);
        }

        return res2;
    }
}
