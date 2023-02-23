package leetcode.array.pascal_triangle_118;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(generate(1));
        System.out.println(generate2(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r,pre = null;

        for(int i=0; i<numRows;i++){
            r = new ArrayList<>();
            for(int j=0 ; j<=i ;j++){
                if(j==0 || j == i){
                    r.add(1);
                }else{
                    r.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = r;
            res.add(r);
        }

        return res;
    }

    public static  List<List<Integer>> generate2(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0 ; i < numRows ; i++ ){

            List<Integer> r = new ArrayList<>();

            for(int j = 1 ; j<= i+1 ; j ++){
                if(j==1 || j == i+1){
                    r.add(1);
                }else{
                    r.add(res.get(i-1).get(j-2) +res.get(i-1).get(j-1));
                }

            }

            res.add(r);
        }


        return res;

    }


}
