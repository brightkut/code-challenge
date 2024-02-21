package leetcode.two_pointer.slow_fast_pointer.remove_duplicate.remove_duplicate_from_sort_arr_26;

public class Main {
    public static void main(String[] args) {
        int [] input = {1,1,2};
        int [] input2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(input));
        System.out.println(removeDuplicates(input2));
    }

    // slow fast pointer
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;

        int slow = 0;

        for(int i = 1 ; i < nums.length; i++){
            if(nums[slow] != nums[i]){
                nums[++slow] =  nums[i];
            }
        }

        return slow+1;
    }
}
