package leetcode.string.sum_value_k_set_bit_2859;

import java.util.List;


public class Main {

    //Input: nums = [5,10,1,5,2], k = 1
    //Output: 13
    //Explanation: The binary representation of the indices are:
    //0 = 0002
    //1 = 0012
    //2 = 0102
    //3 = 0112
    //4 = 1002
    //Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
    //Hence, the answer is nums[1] + nums[2] + nums[4] = 13.
    //Example 2:
    //
    //Input: nums = [4,3,2,1], k = 2
    //Output: 1
    //Explanation: The binary representation of the indices are:
    //0 = 002
    //1 = 012
    //2 = 102
    //3 = 112
    //Only index 3 has k = 2 set bits in its binary representation.
    //Hence, the answer is nums[3] = 1.
    public static void main(String[] args) {

    }

    //pass
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int [] count = new int[nums.size()];

        for(int i =  0 ; i < nums.size(); i++){
            int c = 0 ;
            int v = i;

            while(v > 0 ){
                if(v % 2!= 0){
                    c++;
                }
                v/=2;
            }

            count[i] = c;
        }

        int sums = 0 ;

        for(int j =0 ; j< count.length ; j++){
            if(count[j]==k){
                sums+=nums.get(j);
            }
        }

        return  sums;
    }
}
