package leetcode.string.longest_shortest_kind_of_string.largest_odd_number_in_str_1903;

public class Main {
    public static void main(String[] args) {

        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
    }

    public static String largestOddNumber(String num) {
        // 1. if last element is odd number return num (it mean this number is odd)
        // 2. else we find the element from the last index to first if we found odd number it mean we can substring since first index
        // 4. if not found we can return ""

        if(num.charAt(num.length()-1) % 2 != 0) return num;


        for (int i = num.length()-1 ; i >=0 ; i-- ){
            int r = Integer.parseInt(String.valueOf(num.charAt(i)));

            if(r % 2 != 0 ){
                return num.substring(0,i+1);
            }
        }

        return "";
    }
}
