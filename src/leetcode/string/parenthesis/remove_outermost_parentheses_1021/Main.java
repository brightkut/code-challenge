package leetcode.string.parenthesis.remove_outermost_parentheses_1021;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }

    public static String removeOuterParentheses(String s) {
        /*
         1. If open bracket
            - check stack empty ?: empty = outer parentheses and insert to stack , empty != ok to insert in answer and stack
         2.  If close bracket
            - pop from stack if not empty can insert
            - if empty no need to do anything because It out parentheses
         */


        Stack<Character> stack  = new Stack<>();
        String ans = "";

        for (int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '('){
                if(stack.isEmpty()){
                    stack.add('(');
                }else {
                    stack.add('(');
                    ans+="(";
                }
            }else {
                stack.pop();
                if(!stack.isEmpty()){
                    ans+=")";
                }
            }
        }

        return ans;
    }
}
