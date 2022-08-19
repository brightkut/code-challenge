package leetcode.array.palindrome_number_9;

public class Main {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return  false;
        }
        if(x<10){
            return true;
        }
        if(x%10==0) {
            return false;
        }

        int reverseNumber = 0;
        int startNumber = x;

        while (startNumber > 0){
            // get last digit of input and add into reverseNumber(use reverseNumber like array for integer)
            reverseNumber = reverseNumber * 10 +(startNumber%10);

            // cut last digit from input(startNumber)
            startNumber = startNumber/10;

            if(reverseNumber==startNumber){
                return true;
            }
        }

        return reverseNumber == x;
    }
}
