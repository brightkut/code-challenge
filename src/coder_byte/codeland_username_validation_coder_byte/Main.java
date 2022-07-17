package coder_byte.codeland_username_validation_coder_byte;

public class Main {
    public static void main(String[] args) {

        String input = "u__hello_world123";
        System.out.println(CodelandUsernameValidation(input));
    }

    public static String CodelandUsernameValidation(String str) {
        if(str.length()<4 || str.length()> 25) return "false";

        // letter 97-122 , 65-90
        // number 48-57
        // underscore 95

        for (int i = 0 ;i< str.length();i++){
            char c = str.charAt(i);
            int ascii = c;

            if(i==0 && !isLetter(ascii) ){
                return "false";
            }else if (i == str.length()-1 && isUnderscore(ascii)){
                return "false";
            }else if(!isLetter(ascii) && !isNumber(ascii) && !isUnderscore(ascii)){
                return "false";
            }
        }
        return "true";
    }

    private static boolean isNumber(int number){
        return number >= 48 && number <= 57;
    }

    private static boolean isLetter(int number){
        return (number >= 65 && number <= 90) || (number >= 97 && number <= 122);
    }

    private static boolean isUnderscore(int number){
        return number == 95;
    }
}
