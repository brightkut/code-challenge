package leetcode.string.sorted.custom_sort_string_791;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //order = "cba",   s = "abcd"
        //order = "cbafg", s = "abcd"
        //order = "abc", s = "eace"

        System.out.println(customSortString("cba","abcd"));
        System.out.println(customSortString("cbafg","abcd"));
        System.out.println(customSortString("abc","eace"));


    }

    //pass
    public static String customSortString(String order, String s) {
        HashSet<Character> h = new LinkedHashSet<>();
        for(int i = 0 ; i < order.length() ; i++){
            h.add(order.charAt(i));
        }

        HashMap<Character, Integer> h2 = new LinkedHashMap<>();

        for(int j =0 ; j < s.length(); j++){
            h2.put(s.charAt(j), h2.getOrDefault(s.charAt(j),0) +1 );
        }

        String ans = "";

        for(Character c : h){
            if(h2.containsKey(c)){
                int v = h2.get(c);

                for (int i =0 ; i < v ; i++){
                    ans += c;
                }
                h2.remove(c);
            }
        }

        for(Map.Entry<Character, Integer> ch : h2.entrySet()){
            char k = ch.getKey();
            int v = ch.getValue();

            for(int i = 0 ; i< v ; i++){
                ans+=k;
            }
        }

        return ans;
    }
}
