package leetcode.two_pointer.rotating_the_box_1861;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //[["#",".","#"]]

        // 3x1
        char[][] c = new char[][] {{'#','.','#'}};
        System.out.println(c.length);
        System.out.println(c[0].length);
        char[][] c2 = new char[][] {{'#','.','*','.'}, {'#','#','*','.'}};
        System.out.println(c2.length);
        System.out.println(c2[0].length);
//        print2D(rotateTheBox(c));
        print2D(rotateTheBox(c2));
    }

    public static char[][] rotateTheBox(char[][] box) {
        // m(column) and n (row)
        // 3 x1
        // 1 x 3



        //row
        int m = box[0].length;
        // column
        int n = box.length;

        char[][] res = new char[n][m];

//        System.out.println("m : "+m + " n: "+n);

        for(int i = 0 ; i < n; i++){
            boolean isSpace = false;
            List<List<Integer>> spacePair = new ArrayList<>();
            for(int j = m-1 ; j >= 0 ;j--){
                char element = box[i][j];

//                System.out.println("i: "+i+" j: "+j);
//                System.out.println("element: " + element);

                res[j][i] = '.';

                if(!isSpace){
                    // if element is stone or obstacle
                    if(element == '#' || element == '*'){
                        res[j][i] = element;
                    }else {
                        res[j][i] = element;
                        List<Integer> pair = new ArrayList<>();
                        pair.add(i);
                        pair.add(j);
                        spacePair.add(pair);
                        isSpace =true;
                    }
                }else {

                    // if element is space
                    if(element == '.'){
                        res[j][i] = element;
                        List<Integer> pair = new ArrayList<>();
                        pair.add(i);
                        pair.add(j);
                        spacePair.add(pair);

                    }else if(element == '*'){
                        res[j][i] = element;
                        spacePair.clear();
                        isSpace = false;
                    }else {
                        List<Integer> pair = spacePair.get(0);
                        res[pair.get(0)][pair.get(1)] = element;
                        spacePair.remove(0);
                        if(spacePair.size() == 0){
                            isSpace = false;
                        }
                    }

                }

            }
        }

        return res;

    }


    public static void print2D(char[][] box){
        String res = "";

        for(int  i = 0 ; i < box.length ;i++){
            for(int j = 0 ; j < box[i].length; j++){
                res+=box[i][j];
            }
            if(i != box.length -1){
                res+="\n";
            }
        }

        System.out.print(res);
    }
}
