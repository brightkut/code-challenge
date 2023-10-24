package learning.arrays_and_strings.two_pointer;

public class ReverseString {

//    Example 1:
//
//    Input: s = ["h","e","l","l","o"]
//    Output: ["o","l","l","e","h"]
//    Example 2:
//
//    Input: s = ["H","a","n","n","a","h"]
//    Output: ["h","a","n","n","a","H"]
    public static void main(String[] args) {

    }

    public static void reverseString(char[] s) {
        int l = 0 , r = s.length - 1;

        while (l < r){
            char f = s[l];
            s[l] = s[r];
            s[r] = f;
            l++;
            r--;
        }
    }
}
