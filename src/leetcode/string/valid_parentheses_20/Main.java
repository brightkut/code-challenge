package leetcode.string.valid_parentheses_20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "()[}";
        System.out.println(isValid(input));
    }

    //Stack implementation
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character>map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(char c: s.toCharArray()){
            if(c =='(' ||c =='{'|| c =='[' ){
                stack.push(c);
            }else {
                char p = stack.empty()? 'a':stack.pop();
                //case insert close bracket first
                if(p == 'a'){
                    return false;
                }
                if(c != map.get(p)){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
