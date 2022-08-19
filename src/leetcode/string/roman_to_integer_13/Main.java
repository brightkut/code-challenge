package leetcode.string.roman_to_integer_13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //III
        //IV
        //LVIII
        //MCMXCIV
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        if(s.length()==1){
            return romanMap.get(s.charAt(0));
        }

        // last value only plus
        int sum = romanMap.get(s.charAt(s.length()-1));

        for(int i =0;i<s.length()-1;i++){
         int value1 = romanMap.get(s.charAt(i));
         int value2 = romanMap.get(s.charAt(i+1));

         sum = (value1>=value2) ? sum + value1 : sum - value1;
        }

        return sum;
    }
}
