package leetcode.two_pointer.reverse_and_swapping.reverse_string_344;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
            reverseString(new char[]{'h','e','l','l','o'});
    }

    // use stack way
    public static void reverseString(char[] s) {
        Stack<Character> rs = new Stack<>();

        for(char c : s)  rs.push(c);

        for(int i = 0 ;i< s.length ;i++) s[i] = rs.pop();

    }

    // two pointer way
    public static void reverseString2(char[] s) {
        int l = 0 , r = s.length - 1;

        while (l < r){
            char temp = s[r];
            s[r] = s[l];
            s[l] = temp;
            l++;
            r--;
        }
    }
}
