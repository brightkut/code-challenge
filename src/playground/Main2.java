package playground;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
//        int [] i = {3, 8, 2, 3, 3, 2,4,4,4,4};

        int [] i = {5, 5, 5, 5, 5};
        System.out.println(solution(i));

        int N = 6;
        //(a-z) odd number
        //abcdef
        //aaaaa// 5  b //1
        //a(N-1) b 1
    }

    public static int solution(int[] A) {
        // key , count
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i : A){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int number = 0;
        int count = 0;
        System.out.println(h);

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if(key == value){
                if(value > count){
                    number = key;
                    count = value;
                }
            }
        }

        return number;
    }
    public static String solution(int N) {
        //case mod 2 == 0
        if (N %2 == 0){
            String b= "b";
            return getA(N-1) + b;
        }
        return getA(N);
    }

    public static String getA(int n){
        String res ="";

        for(int i = 0; i <n ; i++){
            res+="a";
        }

        return res;
    }
}
