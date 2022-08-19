package leetcode.array.remove_duplicate_from_sorted_array_26;

public class Main {
    public static void main(String[] args) {
        int [] input = new int[10];
        input[0]= 0;
        input[1]= 0;
        input[2]= 1;
        input[3]= 1;
        input[4]= 1;
        input[5]= 2;
        input[6]= 2;
        input[7]= 3;
        input[8]= 3;
        input[9]= 4;
        System.out.println(removeDuplicates(input));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length ==1 )return 1;

        int len= nums.length;

        int i=0;
        for(int j=1;j<len;j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i]= nums[j];
            }
        }

        return i+1;
    }
}
