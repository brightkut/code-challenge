package leetcode.string.implment_str_28;

public class Main {
    public static void main(String[] args) {
        String haystack ="abc";
        String needle = "c";

        System.out.println(strStr(haystack,needle));
    }

    //brute force
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        if(needle.length()>haystack.length()) return -1;
        if(needle.equals(haystack)) return 0;

        for(int i=0;i<haystack.length();i++){
            for(int j=i;j<haystack.length();j++){
                String r = haystack.substring(i,j+1);
                System.out.println(r);
                if(r.equals(needle)) return i;
            }
        }

        return -1;
    }
}
