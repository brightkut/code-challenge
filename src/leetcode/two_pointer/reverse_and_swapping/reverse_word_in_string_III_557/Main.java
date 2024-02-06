package leetcode.two_pointer.reverse_and_swapping.reverse_word_in_string_III_557;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));
    }

    public static String reverseWords(String s) {
        String [] sp = s.split(" ");
        String res = "";

        for(int i = 0; i<sp.length ; i++){
            if(i == sp.length -1) res += reverse(sp[i]);
            else res = res + reverse(sp[i]) + " ";
        }

        return res;
    }

    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder();

        for(char c : s.toCharArray()){
            stringBuilder.append(c);
        }

        return stringBuilder.reverse().toString();
    }
}
