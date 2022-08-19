package leetcode.string.goat_latin_824;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String input = "I speak Goat Latin";

        System.out.println(toGoatLatin(input));
    }

    public static String toGoatLatin(String sentence) {
        String [] str = sentence.split(" ");
        StringJoiner res = new StringJoiner(" ");

        int count = 1;
        for(String s: str){
            //check vowel
            if(isVowel(String.valueOf(s.charAt(0)))){
                res.add(s+"ma"+"a".repeat(count));
            }else{
                //isConsonant
                char c = s.charAt(0);
                res.add(s.substring(1)+c+"ma"+"a".repeat(count));
            }
            count++;
        }

        return res.toString();
    }

    private static boolean isVowel(String v){
        String vLower = v.toLowerCase();

        return  ("a".equals(vLower) || "e".equals(vLower) || "i".equals(vLower) || "o".equals(vLower) || "u".equals(vLower)) ;
    }
}
