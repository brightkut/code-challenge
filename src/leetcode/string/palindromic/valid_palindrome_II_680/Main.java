package leetcode.string.palindromic.valid_palindrome_II_680;

public class Main {
    public static void main(String[] args) {
        //abca

        //abdefdca
        System.out.println(validPalindrome("ececabbacec"));

        //daacd
    }

    //Two pointer
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;


        while (left <= right) {
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s.substring(left,right)) || isPalindrome(s.substring(left+1,right+1));
            }
            left++;
            right--;
        }

        return true;
    }

    public  static boolean isPalindrome(String s2){
        int l = 0 , r = s2.length()-1;
        while (l<=r){
         if(s2.charAt(l) != s2.charAt(r)) return false;
         l++;
         r--;
        }
        return true;
    }

}
