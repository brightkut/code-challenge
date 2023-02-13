package leetcode.array.two_pointer.reverse_vowels_of_a_string_345;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {

        HashMap<String,Integer> h = new HashMap<>();
        h.put("a",1);
        h.put("e",1);
        h.put("i",1);
        h.put("o",1);
        h.put("u",1);

        char[] res = s.toCharArray();

        int left = 0 ;
        int right = s.length()-1;

        while (left < right) {

            if (h.containsKey(String.valueOf(res[left]).toLowerCase()) && h.containsKey(String.valueOf(res[right]).toLowerCase())) {
                char temp = res[left];
                res[left] = res[right];
                res[right] = temp;

                left++;
                right--;
            }else if (h.containsKey(String.valueOf(res[left]).toLowerCase())){
                right--;
            }else if(h.containsKey(String.valueOf(res[right]).toLowerCase())){
                left++;
            }else{
                left++;
                right--;
            }
        }

        String res2 = "";

        for(int i =0 ; i<res.length;i++ ){
            res2+=res[i];
        }

        return res2;
    }

}
