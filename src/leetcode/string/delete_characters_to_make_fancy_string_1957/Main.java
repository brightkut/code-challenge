package leetcode.string.delete_characters_to_make_fancy_string_1957;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "aaabaaaa";
//        System.out.println(makeFancyString(input));
//        System.out.println(makeFancyString2(input));
        System.out.println(makeFancyString3(input));
    }

    //Time exceed (hash map)
    public static String makeFancyString(String s) {
        HashMap<String,Integer> keyInput = new HashMap<>();
        int limit = 2;
        String result = "";
        String s2 = "";

        for (int i =0 ; i < s.length(); i++){
            String s1 = String.valueOf(s.charAt(i));
            Integer value = keyInput.get(s1) == null ? 0 : keyInput.get(s1);
            if(s1.equals(s2)){
                if (value != limit){
                    keyInput.put(s1,value+1);
                    result+=s1;
                }
            }else {
                keyInput.remove(s2);
                s2 = s1;
                keyInput.put(s1,value+1);
                result+=s1;
            }

        }

        return result;
    }

    // time exceed (no hash map)
    public static String makeFancyString2(String s) {
        int limit = 3;
        int count = 0;
        String result = "";
        String start = "";

        for (int i =0 ; i < s.length(); i++){
            String s1 = String.valueOf(s.charAt(i));
            ++count;
            if (s1.equals(start)){
                if(count<limit){
                    result+=s1;
                }
            }else {
                count = 1;
                start = s1;
                result+=s1;
            }
        }

        return result;
    }

    //Dynamic Programming
    public static String makeFancyString3(String s){
        if(s.length() <=2) return s;
        char c1 = s.charAt(0);
        char c2 = s.charAt(1);

        StringBuilder res = new StringBuilder();
        res.append(c1);
        res.append(c2);

        for(int i =2 ; i< s.length(); i++){
            char value = s.charAt(i);

            // 3 value equal
            if(c1 == c2 && c1 == value){
                continue;
            }

            res.append(value);

            c1 = c2;
            c2 = value;
        }

        return res.toString();
    }
}
