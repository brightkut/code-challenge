package leetcode.array.find_words_contain_character_2942;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //Example 1:
    //
    //Input: words = ["leet","code"], x = "e"
    //Output: [0,1]
    //Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
    //Example 2:
    //
    //Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
    //Output: [0,2]
    //Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
    //Example 3:
    //
    //Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
    //Output: []
    //Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
    public static void main(String[] args) {
        String [] w = {"leet","code"};
        String [] w2 = {"abc","bcd","aaaa","cbc"};
        String [] w3 = {"abc","bcd","aaaa","cbc"};

        System.out.println(findWordsContaining(w,'e'));
        System.out.println(findWordsContaining(w2,'a'));
        System.out.println(findWordsContaining(w3,'z'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();

        for(int i = 0 ; i< words.length ; i++){

            for(char c : words[i].toCharArray()){
                if (c==x){
                    res.add(i);
                    break;
                }
            }
        }

        return res;
    }
}
