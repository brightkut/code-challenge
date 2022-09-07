package leetcode.string.maximum_number_of_word_2114;

public class Main {
    public static void main(String[] args) {
        String[] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] input2 = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(input));
        System.out.println(mostWordsFound(input2));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;

        for(int i = 0 ; i < sentences.length ; i++){
            String[]split = sentences[i].split(" ");
            max = Math.max(max , split.length);
        }

        return max;
    }
}
