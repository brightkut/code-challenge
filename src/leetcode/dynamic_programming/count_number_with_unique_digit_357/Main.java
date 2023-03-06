package leetcode.dynamic_programming.count_number_with_unique_digit_357;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(countNumbersWithUniqueDigits(0));
    }

    public static int countNumbersWithUniqueDigits(int n) {
        int limit = (int) Math.pow(10,n);

        System.out.println(limit);
        if(limit == 1) return 1;

//        int [] arr = {0,1,2,3,4,5,6,7,8,9};

        int c =0 ;
        for(int i = 0 ; i <= limit ; i++){
            if(!isDuplicate(Integer.toString(i))) c++;
        }

        return c;
    }

    public static boolean isDuplicate(String s ){
        HashMap<Character, Integer> h = new HashMap<>();
        System.out.println(s.toCharArray());
        for(Character character : s.toCharArray()) h.put(character,h.getOrDefault(character,0)+1);

        for(Integer f : h.values()){
            if(f >  1) return true;
        }
        return false;
    }
}
