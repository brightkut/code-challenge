package leetcode.contain_duplicate_217;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length;i++){
            if(map.containsKey(nums[i])) return true;

            map.put(nums[i],1);
        }

        return false;
    }
}
