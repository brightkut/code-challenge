package leetcode.string.check_type_string.isomorphic_string_205;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //22.48
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));
        System.out.println(isIsomorphic("bbbaaaba","aaabbbba"));
        System.out.println(isIsomorphic("abaab","bbbbb"));
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
        //1. create mapping to store pair data
        //2. check it mapping with original or not in case that already have that pair
        HashMap<Character, Character> h = new HashMap<>();
        HashMap<Character, Character> h2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if( (h.containsKey(c1) && h.get(c1) != c2) || (h2.containsKey(c2) && h2.get(c2) != c1)  ){
                return  false;
            }

            h.put(c1,c2);
            h2.put(c2,c1);
        }

        return true;
    }
}
