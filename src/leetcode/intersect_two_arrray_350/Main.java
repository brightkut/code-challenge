package leetcode.intersect_two_arrray_350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    int[]  nums1 = {2,1};
    int [] nums2 = {1,1};
    System.out.println(intersect(nums1,nums2));
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
}
