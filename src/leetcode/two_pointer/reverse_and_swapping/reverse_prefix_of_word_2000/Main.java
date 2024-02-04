package leetcode.two_pointer.reverse_and_swapping.reverse_prefix_of_word_2000;

public class Main {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }

    public static String reversePrefix(String word, char ch) {
        String s = "";

        int count = 0;
        for(int i = 0 ; i< word.length() ; i++){
            char c = word.charAt(i);
            s+=c;
            if(c == ch && count == 0){
                s = reverse(s);
                count++;
            }
        }

        return s.toString();
    }

    public static String reverse(String s){
        String r = "";
        for(int i = s.length()-1 ; i>=0 ; i--){
            r+=s.charAt(i);
        }

        return r;
    }
}
