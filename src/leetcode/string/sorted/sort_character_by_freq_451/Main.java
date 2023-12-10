package leetcode.string.sorted.sort_character_by_freq_451;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));
        System.out.println(frequencySort("raaeaedere"));
    }

    //pass
    public static String frequencySort(String s) {
        // 1. count char
        // 2. sort by freq
        // 3. sort by lower case

        HashMap<Character, Integer> h = new LinkedHashMap<>();

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            h.put(c, h.getOrDefault(c,0)+1);
        }

        char[]  c = new char[h.size()];
        char temp;

        int j = 0;

        for (Map.Entry<Character, Integer> entry : h.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            if(j == 0 ){
                c[0] = key;
            }

            for(int k = j ; k > 0 ; k--){
                int v1 = h.get(c[k-1]);


                if(v1 < value){
                    temp = c[k-1];
                    c[k-1] = key;
                    c[k] = temp;
                }else {
                    c[k] = key;
                    break;
                }
//                for (int z = 0 ; z < c.length ; z++){
//                    System.out.print(c[z] +" ");
//                }
//                System.out.println();
            }

            j++;
        }
        String ans = "";

        for(char cl : c){
            int l = h.get(cl);

            for(int i = 0 ; i < l ; i++){
                ans+=cl;
            }
        }

        return ans;

    }
}
