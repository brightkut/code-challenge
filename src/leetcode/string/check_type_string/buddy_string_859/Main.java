package leetcode.string.check_type_string.buddy_string_859;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(buddyStrings("ab","ba"));
        System.out.println(buddyStrings("aa","aa"));
        System.out.println(buddyStrings("ab","ab"));
    }
    public static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if(s.equals(goal)){
            HashSet<Character> h = new HashSet<>();
            for(int i = 0 ; i < s.length() ; i++) h.add(s.charAt(i));

            return h.size() < s.length();
        }

        List<Integer> diff = new ArrayList<>();

        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                diff.add(i);
            }
        }

        if(diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && goal.charAt(diff.get(0)) == s.charAt(diff.get(1))){
            return true;
        }

        return false;
    }
}
