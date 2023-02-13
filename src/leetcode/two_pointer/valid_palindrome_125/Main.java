package leetcode.two_pointer.valid_palindrome_125;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));

        System.out.println(isPalindrome3("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome3("race a car"));
        System.out.println(isPalindrome3(" "));
    }

    public static boolean isPalindrome(String s) {
        if(s.length()==1) return true;
        String s2 = "";

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)) s2+=String.valueOf(c).toLowerCase();
        }

        int l = 0 ,r = s2.length()-1;

        if(s2.length()==2) return  s2.charAt(0) == s2.charAt(1);
        if(s2.length()==0) return true;

        while (l<r){
            if(s2.charAt(l)!= s2.charAt(r)) return false;
            l+=1;
            r-=1;
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        if(s.length()==1) return true;
        String s2 = "";

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)) s2+=String.valueOf(c).toLowerCase();
        }

        for(int j = 0 ; j<s2.length();j++){
            char f = s2.charAt(j);
            char f2 = s2.charAt(s2.length()-1-j);
            if(j<s2.length()-1-j){
                if(f!=f2) return false;
            }
        }
        return true;
    }

    //Two Pointer
    public static boolean isPalindrome3(String s){

        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)) s2+=String.valueOf(c).toLowerCase();
        }

        int left = 0, right =  s2.length()-1;

        while (left<= right){
            if (s2.charAt(left) != s2.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
