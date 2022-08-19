package leetcode.array.move_zeroes_283;

public class Main {
    public static void main(String[] args) {
        int [] input1 = {0,1,0,3,12};
        int [] input2 = {0};

        moveZeroes(input1);
        System.out.println();
        moveZeroes(input2);
    }

    public static void moveZeroes(int[] nums) {
        //count not equals 0
        int c = 0;

        for(int i = 0 ; i< nums.length; i++) if(nums[i]!= 0) nums[c++] = nums[i];

        for(int j = c ; j< nums.length ; j++) nums[j] = 0;

//        for(int a : nums) System.out.print(a+" ");
    }
}
