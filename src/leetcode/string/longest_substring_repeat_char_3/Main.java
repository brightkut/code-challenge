package leetcode.string.longest_substring_repeat_char_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbb"));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));

    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;

        int i = 0, j = 0, max = 0;

        Set<Character> h= new HashSet<>();

        while (j< s.length()){
            if(!h.contains(s.charAt(j))){
                h.add(s.charAt(j++));
                max = Math.max(max,h.size());
            }else {
                h.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
