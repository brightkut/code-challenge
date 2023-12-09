package leetcode.string.check_type_string.valid_agram_242;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int [] map = new int[200];
        int [] map2 = new int[200];

        for(int j = 0 ; j < s.length() ; j++){
            map[s.charAt(j)]++;
            map2[t.charAt(j)]++;
        }

        for(int c = 0 ; c < map.length ; c++){
            if(map[c] != map2[c]){
                return false;
            }
        }

        return true;
    }
}
