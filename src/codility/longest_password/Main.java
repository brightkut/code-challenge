package codility.longest_password;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("test 5 a0A pass007 ?xy1"));
    }
    public static int solution(String S) {
        // Implement your solution here
        String[] words =  S.split(" ");
        int max = -1;
        for(String s : words){
            if (isValidPassword(s) && s.length() > max) {
                    max = s.length();
            }
        }

        return max;
    }
    public static boolean isValidPassword(String s){
        int letter = 0;
        int digit = 0;

        for(int i = 0 ; i < s.length();i++){
            if(Character.isLetter(s.charAt(i))) letter++;
            else if(Character.isDigit(s.charAt(i))) digit++;
            else return false;
        }

        return letter % 2 == 0 && ((digit %2)!= 0);
    }
}
