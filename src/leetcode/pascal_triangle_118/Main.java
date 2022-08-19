package leetcode.pascal_triangle_118;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(generate(1));
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


}
