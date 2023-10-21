package leetcode.string.isomorphic_string_205;

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //22.48
    }

//    /Input: s = "egg", t = "add"
//    Output: true
//    Example 2:
//
//    Input: s = "foo", t = "bar"
//    Output: false
//    Example 3:
//
//    Input: s = "paper", t = "title"
//    Output: true
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() == t.length()){
            HashMap<Character,Character> h = new HashMap<>();

            StringBuilder stringBuilder = new StringBuilder();

            for(int i =0 ; i< s.length();i++){
                if(h.containsKey(t.charAt(i))){
                    stringBuilder.append(h.get(t.charAt(i)));
                }else {
                    stringBuilder.append(s.charAt(i));
                    h.put(t.charAt(i),s.charAt(i));
                }
            }

            return s.equals(stringBuilder.toString());
        }

        return false;
    }
}
