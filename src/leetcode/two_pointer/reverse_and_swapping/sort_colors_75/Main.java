package leetcode.two_pointer.reverse_and_swapping.sort_colors_75;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] input = {2,0,2,1,1,0};
        sortColors(input);
        System.out.println(Arrays.toString(input));;
    }

    // bad way O(n)
    public static void sortColors(int[] nums) {
        // 1. create 3 variable and count the number of each '0' ,'1' and '2'
        // 2. reassign value
        int z = 0;
        int o = 0;
        int t = 0;

        for(int i : nums) {
            if(i == 0 ) z++;
            else if (i==1) o++;
            else if(i==2) t++;
        }

        for(int i = 0 ; i < nums.length; i++){
            if(z!=-0){
                nums[i] = 0;
                z--;
            }else if(o!=0){
                nums[i] = 1;
                o--;
            }else if(t!=0){
                nums[i] = 2;
                t--;
            }
        }
    }
}
