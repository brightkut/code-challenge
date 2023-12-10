package leetcode.string.longest_shortest_kind_of_string.longest_substring_between_two_equal_character_1624;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
        System.out.println(maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }

    //pass
    public static int maxLengthBetweenEqualCharacters(String s) {
        //1. case not found we will update count and update index
        //2. case found we will find maximum length and update max and update count and index

        int [] index = new int[26];
        int [] count = new int[26];

        int max = -1;

        for(int i =0 ; i< s.length(); i++){
            int c  = count[s.charAt(i) - 'a'];

            //case found
            if(c > 0){
                int size = i - index[s.charAt(i)-'a'] -1;
                max = Math.max(max,size);
                count[s.charAt(i)-'a']++;
            }else {
                //case not found
                count[s.charAt(i)-'a']++;
                index[s.charAt(i)-'a'] =  i;
            }
        }

        return max;
    }
}
