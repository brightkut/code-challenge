package coder_byte.min_window_substring_coder_byte;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);

        String [] input = {"aaffhkksemckelloe", "fhea"};

        System.out.print(MinWindowSubstring(input));
    }

    public static String MinWindowSubstring(String[] strArr) {
        HashMap<String,Integer> setResult = new HashMap<>();

        for (int i = 0; i<strArr[0].length();i++){
            String res = String.valueOf(strArr[0].charAt(i));

            List<String> setInput = new ArrayList<>(Arrays.asList(strArr[1].split("")));

            if(setInput.contains(res)){
                setInput.remove(res);
            }

            for(int j = i+1 ; j<strArr[0].length() ;j ++){
                res+=(String.valueOf(strArr[0].charAt(j)));
                if(setInput.contains(String.valueOf(strArr[0].charAt(j)))){
                    setInput.remove(String.valueOf(strArr[0].charAt(j)));
                }

                if(setInput.isEmpty()){
                   setResult.put(res,res.length());
                   break;
                }
            }
        }

        String result = "";
        Integer integer = Integer.MAX_VALUE;

        for (Map.Entry<String,Integer> r: setResult.entrySet()){
            if(r.getValue()<integer){
                integer = r.getValue();
                result = r.getKey();
            }
        }

        return result;
    }
}
