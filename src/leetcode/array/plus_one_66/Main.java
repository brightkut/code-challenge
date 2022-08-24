package leetcode.array.plus_one_66;

import java.awt.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] input = {4,3,2,1};
        int[] input2 = {9};
        int[] input3 = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(plusOne(input));
        System.out.println(plusOne(input2));
        System.out.println(plusOne(input3));
    }

    public static int[] plusOne(int[] digits) {

        for(int i = digits.length-1 ; i>=0; i --){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
                if(i==0){
                    int [] r = new int[digits.length+1];
                    r[0]=1;
                    return r;
                }
            }
        }

        return null;
    }
}
