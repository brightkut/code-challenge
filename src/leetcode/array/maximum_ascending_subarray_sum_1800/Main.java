package leetcode.array.maximum_ascending_subarray_sum_1800;

public class Main {
    public static void main(String[] args) {

        int [] input = {10,20,30,5,10,50};
        int [] input2 = {10,20,30,40,50};
        int [] input3 = {12,17,15,13,10,11,12};

        System.out.println(maxAscendingSum(input));
        System.out.println(maxAscendingSum(input2));
        System.out.println(maxAscendingSum(input3));
    }

    public static int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        int first = 0;

        for(int n : nums){
            if(n > first){
                sum+=n;
            }else{
                sum = n ;
            }

            first = n;

            max = Math.max(max ,sum);
        }

        return max;
    }
}
