package coder_byte.question_mark_coder_byte;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "acc?7??sss?3rr1??????5";
        System.out.println(QuestionsMarks(input));
    }


    public static String QuestionsMarks(String str) {
        int result = 0;
        boolean firstInt = true;
        int setFirstIndex = 0;
        ArrayList<Integer> indexQuestion = new ArrayList<>();

        //63
        for (int i =0; i < str.length() ; i++){
            int letter = str.charAt(i);

            if(letter==63){
                indexQuestion.add(i);
            }else if(isNumber(letter) && firstInt){
                result+=Integer.parseInt(String.valueOf(str.charAt(i)));
                setFirstIndex = i;
                firstInt = false;
            }else if(isNumber(letter) && !firstInt){

                if(result + Integer.parseInt(String.valueOf(str.charAt(i))) >=10 ){
                    int round = i;
                    int finalSetFirstIndex = setFirstIndex;

                    long count = indexQuestion.stream().filter(in -> in >= finalSetFirstIndex && in <= round).count();
                    if(count != 3 ){
                        return "false";
                    }
                    setFirstIndex = 0;
                    firstInt = true;
                    result = 0;
                }else {
                    setFirstIndex = i;
                    result = Integer.parseInt(String.valueOf(str.charAt(i)));
                }
            }
        }

        return "true";
    }

    private static boolean checkRes(int result,int questionCount){
        return result >=10 && questionCount ==3;
    }
    private static boolean isNumber(int number){
        return number >= 48 && number <= 57;
    }
}
