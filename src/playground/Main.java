package playground;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        System.out.println(getRow(0));
        System.out.println(getRow(1));
        System.out.println(getRow(2));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res= new ArrayList<>();

        for(int i = 0; i < rowIndex+1; i++){
            List<Integer> res2 = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                if(j==0 || j== i){
                    res2.add(1);
                }else{
                    res2.add(res.get(j-1)+res.get(j));
                }
            }

            res = res2;
        }

        return res;
    }

    public static String decodeBase64(String s){
        byte[] decodedBytes = Base64.getDecoder().decode(s);

        return new String(decodedBytes);
    }

    public static String getUniqueString(String s){
        HashSet<Character>h1 = new HashSet<>();
        String s1Unique  = "";
        for(Character c : s.toCharArray()){
            if(!h1.contains(c)){
                h1.add(c);
                s1Unique+=String.valueOf(c);
            }
        }

        return s1Unique;
    }

    public static String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }

    public static String reorder(String s){
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        for(Character c : s.toCharArray()){
            String ch = String.valueOf(c);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        String res ="";

        for(String ch: map.keySet()){
            if(map.get(ch) == 1) res+=ch;
        }

        return res;
    }
}
