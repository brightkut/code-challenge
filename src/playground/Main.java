package playground;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
//        int [] n= {-2,1,-3,4,-1,2,1,-5,4};
//
//        Deque<String> deque = new ArrayDeque<>();
//        deque.add("a");
//        deque.add("b");
//        deque.add("c");
//        System.out.println(deque);
//        System.out.println(deque.removeLast());
//        System.out.println(deque);

//        var whatIsIt string secret := "CYtZBsWZaZliYZocWLZlXuZZYWYeYXZsXeZXtXWpXeRYYYd!ZnYeWXoYXasnX,WXWrWPoAdWesnciGenWr"
//        StringBuilder stringBuilder = new StringBuilder();
        //XnsaXYoXWeYnZ!dYYYReXpWXtXZeXsZXYeYWYZZuXlZLWcoZYilZaZWsBZtYC,rWneGicnseWdAoPWrWXW rever

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
