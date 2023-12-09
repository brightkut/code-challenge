package leetcode.string.parenthesis.different_way_add_paremtheses_241;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("2-1-1"));
        System.out.println(diffWaysToCompute("2*3-4*5"));
    }

    public static List<Integer> diffWaysToCompute(String expression) {
/*      separate in 3 case
        case 1  = no any symbol-> return that value of array
        case have more than 1 symbol -> separate to left and right will get all of calculate value in list of left and right
        combine it
 */


        List<Integer> res = new ArrayList<>();

        if(expression.length() == 1) res.add(Integer.valueOf(expression.charAt(0)));


        for(int i = 0 ; i < expression.length(); i++){
            char c = expression.charAt(i);

            if( c == '+' || c=='-' || c== '*' || c=='/'){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1,expression.length()));


                for(int l: left){
                    for (int r : right){
                        if(c == '+'){
                            res.add(l+r);
                        }
                        else if(c == '-'){
                            res.add(l-r);
                        }
                        else if(c == '*'){
                            res.add(l*r);
                        }
                        else {
                            res.add(l/r);
                        }
                    }
                }
            }
        }

//        if(res.isEmpty()){
//            res.add(Integer.valueOf(expression));
//        }

        return res;
    }
}
