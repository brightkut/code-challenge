package lseg_interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] input = {-1,1,-2,2} ;// -2

        int[] input2 = {-3,4}; //-3

        int[] input3 = {0,0,0,0}; //0

        System.out.println(minValue(input));
        System.out.println(minValue(input2));
        System.out.println(minValue(input3));
    }

    public static int minValue(int [] A){
        int ans = A.length == 1 ? A[0] : Integer.MAX_VALUE;

        for(int i = 1 ; i < A.length ; i++){
            if(ans> A[i]){
             ans = A[i];
            }
        }


        return ans;
    }
}
