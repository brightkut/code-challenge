package leetcode.array.two_pointer.sum_of_square_number_633;

public class Main {
    public static void main(String[] args) {
//        System.out.println(judgeSquareSum(5));
//        System.out.println(judgeSquareSum(3));
//        System.out.println(judgeSquareSum(4));
        System.out.println(judgeSquareSum2(5));
        System.out.println(judgeSquareSum2(3));
        System.out.println(judgeSquareSum2(4));
    }

    public static boolean judgeSquareSum(int c) {

        int[] nums = new int[c%2==0 ? c : c-1];

        for (int i = 1; i< (c/2)+1 ; i++){
            System.out.println(i);
            System.out.println(c-i);
            nums[i-1] = i;
            nums[nums.length-i] = c-i;
        }

        int left_pointer = 0;
        int right_pointer = nums.length-1;


        while (left_pointer < right_pointer){
            System.out.println(nums[left_pointer]);
            System.out.println(nums[right_pointer]);
            double res = Math.pow(nums[left_pointer],2) + Math.pow(nums[right_pointer],2);
            System.out.println(res);

            if(c == res) return true;
            left_pointer+=1;
            right_pointer-=1;
        }

        return false;
    }

    public static boolean judgeSquareSum2(int c){
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            long cur = left * left + right * right;
            if (cur < c) {
                left++;
            } else if (cur > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
    }
}
