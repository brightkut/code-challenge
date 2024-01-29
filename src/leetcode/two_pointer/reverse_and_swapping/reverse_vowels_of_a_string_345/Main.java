package leetcode.two_pointer.reverse_and_swapping.reverse_vowels_of_a_string_345;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels2("hello"));
        System.out.println(reverseVowels2("leetcode"));
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

    public static String reverseVowels2(String s) {
        HashSet<Character> h = new HashSet<>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');

        int l = 0 , r = s.length() - 1;

        char[] res = s.toCharArray();

        while (l < r){
            char cl = Character.toLowerCase(s.charAt(l));
            char cr = Character.toLowerCase(s.charAt(r));

            if(h.contains(cl) && h.contains(cr)){
                char temp = s.charAt(l);
                res[l] = s.charAt(r);
                res[r] = temp;
                l++;
                r--;
            }else if(h.contains(cl)){
                r--;
            }else {
                l++;
            }
        }

        String res2 = "";
        for(char c : res){
            res2+=c;
        }
        return res2;
    }
}
