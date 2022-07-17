package coder_byte.longest_word_coder_byte;

public class Main {
    public static void main(String[] args) {
        String input = "I love dogs";
        System.out.println(LongestWord(input));

    }

    public static String LongestWord(String sen) {
        String preprocess = "";
        for(int i =0 ;i < sen.length();i++){
            if(Character.isLetter(sen.charAt(i)) || Character.isDigit(sen.charAt(i)) || sen.charAt(i) == ' '){
                preprocess+=sen.charAt(i);
            }
        }

        String[] res = preprocess.split(" ");

        int min = Integer.MIN_VALUE;
        String result = "";

        for (String a : res){

            if(a.length()>min){
                min = a.length();
                result = a;
            }
        }

        return result;
    }
}
