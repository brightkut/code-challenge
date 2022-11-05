package leetcode.string.minimun_sum_four_digit_2160;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int input = 2932;
        int input2 = 4009;

        System.out.println(minimumSum(input));
        System.out.println(minimumSum(input2));
    }

    //O(nlogn)
    public static int minimumSum(int num) {
        int[] arr = new int[4];

        for(int i = 0; i < 4 ; i++){
            arr[i] = num%10;
            num/=10;
        }

        Arrays.sort(arr);

        int num1 = arr[0]*10 + arr[2];
        int num2 = arr[1]*10 + arr[3];

        return num1+num2;
    }
}
