package leetcode.string.other.longest_word_in_dict_720;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String [] input = {"w","wo","wor","worl","world"};
        String [] input2 = {"a","banana","app","appl","ap","apply","apple"};
        String [] input3 = {"a","ba"};


        System.out.println(longestWord(input));
        System.out.println(longestWord(input2));
        System.out.println(longestWord(input3));
    }

    public static String longestWord(String[] words) {
        Arrays.sort(words);

        HashSet<String> h = new HashSet<>();
        String res = "";
        for(String w : words){
            if(w.length() == 1 || h.contains(w.substring(0,w.length()-1))){
                if(w.length() > res.length()) res = w;
                h.add(w);
            }
        }

        return res;
    }
}
