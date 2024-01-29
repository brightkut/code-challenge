package leetcode.two_pointer.reverse_and_swapping.reverse_only_letter_917;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input= "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(input));
        System.out.println(reverseOnlyLetters2(input));
    }

    public static String reverseOnlyLetters(String s) {

        List<Character> reverseAlpha = new ArrayList<>();
        //33-64 91-96

        //add reverse alpha
        for(int i = s.length()-1 ; i>=0 ; i--) if(isLetter(s.charAt(i))) reverseAlpha.add(s.charAt(i));


        char[] res = s.toCharArray();

        int c2 = 0;
        for(int j=0; j<s.length();j++){
            if(isLetter(res[j])) {
                res[j] = reverseAlpha.get(c2)
                ;
                c2++;
            }
        }

        StringBuilder r = new StringBuilder();

        for(char  ch : res){
            r.append(ch);
        }

        return r.toString();
    }

    //Two pointer
    public static String reverseOnlyLetters2(String s) {
        char []c = s.toCharArray();
        int left =0, right = c.length-1;

        while (left < right){
            if(isLetter(c[left]) && isLetter(c[right])){
                //swap
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;

                left++;
                right--;
            }else if(isLetter(c[left])){
                right--;
            }else if (isLetter(c[right])){
                left++;
            }else {
                left++;
                right--;
            }
        }

        return String.copyValueOf(c);
    }

    private static boolean isLetter(int c){
        return (90>=c && c>=65) || (97<=c && c <=122);
    }
}
