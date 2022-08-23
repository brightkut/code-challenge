package leetcode.array.split_array_into_consecutive_659;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPossible(int[] nums) {
        //{value, count}
        HashMap<Integer,Integer> av = new HashMap<>();

        //{value,count}
        HashMap<Integer,Integer> vc = new HashMap<>();

        //assign
        for(int n : nums) av.put(n,av.getOrDefault(n,0)+1);

        //loop
        for(int i =0; i<nums.length ; i++){

            //check element is start of seq?
            if(av.getOrDefault(nums[i],0)<=0){
                continue;
            }else if(vc.containsKey(nums[i]) && vc.getOrDefault(nums[i],0) > 0){
                // add to existing group
                av.put(nums[i],av.getOrDefault(nums[i],0)-1);
                vc.put(nums[i], vc.getOrDefault(nums[i],0)-1);
                vc.put(nums[i]+1, vc.getOrDefault(nums[i]+1,0)+1);

            }else if(av.getOrDefault(nums[i],0)>0 &&av.getOrDefault(nums[i]+1,0)>0 && av.getOrDefault(nums[i]+2,0)>0){
                av.put(nums[i],av.getOrDefault(nums[i],0) - 1);
                av.put(nums[i]+1,av.getOrDefault(nums[i]+1,0) - 1);
                av.put(nums[i]+2,av.getOrDefault(nums[i]+2,0) - 1);
                vc.put(nums[i]+3, vc.getOrDefault(nums[i]+3,0)+1);
            }else{
                return false;
            }
        }

        return true;
    }
}
