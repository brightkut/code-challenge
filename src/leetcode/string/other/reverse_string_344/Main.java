package leetcode.string.other.reverse_string_344;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
            reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
        Stack<Character> rs = new Stack<>();

        for(char c : s)  rs.push(c);

        for(int i = 0 ;i< s.length ;i++) s[i] = rs.pop();

    }
}
