package leetcode.score_of_parentheses_856;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String input = "(())";

        System.out.println(scoreOfParentheses(input));
    }

    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack();
        stack.push(0); // The score of the current frame

        for (char c: s.toCharArray()) {
            if (c == '(')
                stack.push(0);
            else {
                //score of the ith depth
                int v = stack.pop();
                //score of the（i-1)th depth
                int w = stack.pop();
                //collect a new score for the（i-1)th depth
                stack.push(w + Math.max(2 * v, 1));
            }
        }

        return stack.pop();
    }
}
