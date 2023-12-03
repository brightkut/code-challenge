package leetcode.string.parenthesis.maximum_nest_depth_parentheses_1614;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Input: s = "(1+(2*3)+((8)/4))+1"
//        Output: 3
        //(()(()))
//        Input: s = "()(())((()))"
//        Output: 3

        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }

    public  static int maxDepth(String s) {
        // 1. It will ignore other character not include (, ), ""
        // 2. If open bracket insert to stack and check max depth
        // 3. If close bracket we will find depth
        //      It will pop from stack



        int max = 0, depth = 0;

        for(int i =0 ; i < s.length(); i++){
            if(s.charAt(i) == '('){
                depth++;
                max = Math.max(max,depth);

            }else if(s.charAt(i)== ')'){
                depth--;
            }
        }

        return max;
    }
}
