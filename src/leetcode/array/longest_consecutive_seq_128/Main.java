package leetcode.array.longest_consecutive_seq_128;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer>h = new HashMap<>();

        for(int n: nums) h.put(n,1);

        int max = 0;

        for(int num: nums){

            //start seq
            if(!h.containsKey(num-1)){
                int c = 0;
                int s = num;
                while (h.containsKey(s)){
                    s++;
                    c++;
                }

                max = Math.max(c,max);
            }
        }

        return max;
    }
}
