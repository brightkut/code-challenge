package leetcode.array.single_number_136;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] input1 = {2,2,1};
        int[] input2 = {4,1,2,1,2};

        System.out.println(singleNumber(input1));
        System.out.println(singleNumber(input2));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int n : nums) h.put(n,h.getOrDefault(n,0)+1);

        for(int i: nums) if(h.get(i) == 1) return i;

        return 0;
    }
}
