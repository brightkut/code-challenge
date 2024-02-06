package leetcode.contest.minimum_time_revert_word_to_init_state_3029;

public class Main {
    public static void main(String[] args) {
        //2
        System.out.println(minimumTimeToInitialState("abacaba",3));
        //1
        System.out.println(minimumTimeToInitialState("abacaba",4));
        //4
        System.out.println(minimumTimeToInitialState("abcbabcd",2));
    }

    public static int minimumTimeToInitialState(String word, int k) {
        int c = 0;


        String suffix = word.substring(k);

        while (true){
            c++;
            int len = suffix.length();
            String prefix = word.substring(0,len);

            if(prefix.equals(suffix)) return c;

            if(len >= k) suffix = suffix.substring(k);

            else if(len < k) {
                c++;
                break;
            }
        }

        return c;
    }
}
