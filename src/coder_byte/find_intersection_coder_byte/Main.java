package coder_byte.find_intersection_coder_byte;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] input = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        System.out.println(FindIntersection(input));
    }

    public static String FindIntersection(String[] strArr) {
        String [] f = strArr[0].split(",");
        String [] s = strArr[1].split(",");

        TreeMap<String,Integer> count = new TreeMap<>();

        for (int i = 0; i< f.length ; i++){
            if(!count.containsKey(f[i])){
                count.put(f[i],1);
            }else {
                count.put(f[i],count.get(f[i])+1);
            }
        }

        for (int j = 0; j< s.length ; j++){
            if(!count.containsKey(s[j])){
                count.put(s[j],1);
            }else {
                count.put(s[j],count.get(s[j])+1);
            }
        }

        StringJoiner stringJoiner = new StringJoiner(",");

        for (String r : count.descendingKeySet()){
          if(count.get(r) == 2){
              stringJoiner.add(r);
          }
        }

        return stringJoiner.toString().replace(" ","");
    }
}
