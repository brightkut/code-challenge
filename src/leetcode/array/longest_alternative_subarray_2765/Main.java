package leetcode.array.longest_alternative_subarray_2765;

public class Main {
    public static void main(String[] args) {

        int [] nums1 = {2,3,4,3,4};
        int [] nums2 = {4,5,6};
        System.out.println(alternatingSubarray(nums1));
//        System.out.println(alternatingSubarray(nums2));
    }

    public static int alternatingSubarray(int[] nums) {
        int max = -1;
        int c = 1;

        for(int i = 1; i < nums.length ; i++){
            if( i%2 != 0){
                if(nums[i-1]== nums[i]-1){
                    c++;
                }else {
                    c = 1;
                }
            }else {
                if(nums[i-1]== nums[i]+1){
                    c++;
                }else {
                    c= 1;
                }
            }

            max = Math.max(max,c);
        }


        return max > 1 ? Math.max(max,c) : -1;
    }
}
