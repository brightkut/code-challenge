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
        //XnsaXYoXWeYnZ!dYYYReXpWXtXZeXsZXYeYWYZZuXlZLWcoZYilZaZWsBZtYC,rWneGicnseWdAoPWrWXW reverse

        //61 length
        String s1 = "CYtZBsWZaZliYZocWLZlXuZZYWYeYXZsXeZXtXWpXeRYYYd!ZnYeWXoYXasnX,WXWrWPoAdWesnciGenWr";

        String s2 = "CYtZBsWZaZliYZocWLZlXuZZYWYeYXZsXeZXtXWpXeRYYYd!ZnYeWXoYXasnX";
        String s3 = "WXWrWPoAdWesnciGenWr";

        String s1Reorder = reorder(s1);
        String s2Reorder = reorder(s2);
        String s3Reorder = reorder(s3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1Reorder);

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(s2Reorder);

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(s3Reorder);

        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder2.reverse());
        System.out.println(stringBuilder3.reverse());

        System.out.println("CBLupR!,PAGtalicdrosneYZWX".length());
        System.out.println(convert("CBLupR!,PAGtalicdrosneYZWX",2));
        //rWneGicnseWdAoPWrWXW reverse
        //20 length
//        stringBuilder.append(s2);



        System.out.println(s1.length());
        System.out.println(s2.length());
//        System.out.println(stringBuilder.reverse());
        System.out.println(convert(s1,2));
        System.out.println(convert(s2,2));

        String a = convert("CYtZBsWaliocLXuepRdn",2);
        String b = convert("WXrPoAdesnciG",2);

        System.out.println(a);
        System.out.println(b);

        //CYtZBsWaliocLXuepRd!n uniq
        //Q1l0WkJzV2FsaW9jTFh1ZXBSZCFu base64
        //21 length
        /*String s3 = getUniqueString(s1);*/
        //WXrPoAdesnciG unique
        //13 length
        String s4 = getUniqueString(s2);

//        System.out.println(s3.length());
        System.out.println(s4.length());

        System.out.println(convert("CYtZBsWaliocLXuepRd!n",2));
        System.out.println(convert("WXrPoAdesnciG",2));

        //CtBWloLupdnYZsaicXeR!,WrodscGXPAeni
        System.out.println("CtBWloLupdnYZsaicXeR!,WrodscGXPAeni".length());

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
