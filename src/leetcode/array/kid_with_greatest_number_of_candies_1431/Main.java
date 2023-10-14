package leetcode.array.kid_with_greatest_number_of_candies_1431;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] input = {2,3,5,1,3};
        int[] input2 = {4,2,1,1,2};

        System.out.println(kidsWithCandies(input,3));
        System.out.println(kidsWithCandies(input2,1));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //O(n)
        int maxCandies = 0;
        for(int c : candies) if(c > maxCandies) maxCandies = c;

        // Space (n)
        List<Boolean> res = new ArrayList<>();

        for (int c2: candies) {
            if(c2+ extraCandies>=maxCandies){
                res.add(true);
            }else {
                res.add(false);
            }
        }

        return res;
    }
}
