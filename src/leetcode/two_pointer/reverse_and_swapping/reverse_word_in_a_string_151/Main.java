package leetcode.two_pointer.reverse_and_swapping.reverse_word_in_a_string_151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords2("the sky is blue"));
        System.out.println(reverseWords2("a good   example"));
        System.out.println(reverseWords2("  hello world  "));
    }

    public static String reverseWords(String s) {
        s = s.replace(" ","@");
        String[] s2 = s.split("@");
        List<String>r = new ArrayList<>();
        for (int i = s2.length -1, c = 0  ; i >= 0 ; i--, c++){
            if (s2[i].length() > 0){
                r.add(s2[i]);
            }
        }

        return String.join(" ",r);
        //"wU G n F0m rT3zH w 0Dtb8qG9 ruJO EQ x9 a5YKNyuG VnUhxK o AM dpIMVv2SG 2zPeO 3c"
        //"wU G n F0m 1rT3zH 0Dtb8qG91w ruJO EQ x9 a5YKNyuG VnUhxK o 1AM dpIMVv2SG 2zPeO 3c"
    }

    // two pointer
    public static String reverseWords2(String s) {
        int i = 0 , j = 0;
        String res = "";

        while (i < s.length()){
            // find i
            while (i < s.length() && s.charAt(i) == ' '){
                i++;
            }
            if(i >= s.length()) break;
            j = i;
            // find j
            while (j < s.length() && s.charAt(j) != ' '){
                j++;
            }

            String sub = s.substring(i, j);
            if(res.length() == 0){
                res = sub + res;
            }else {
                res = sub + " "+ res;
            }
            i = j;
        }

        return res;
    }
}
