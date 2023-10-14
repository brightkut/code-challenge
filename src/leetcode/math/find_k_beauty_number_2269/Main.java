package leetcode.math.find_k_beauty_number_2269;

// Sliding Window
public class Main {
    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240,2));
        System.out.println(divisorSubstrings(430043,2));
    }

    public static int divisorSubstrings(int num, int k) {
        String nStr = Integer.toString(num);
        int round = (nStr.length() - k) + 1;
        int c = 0 ;

        for(int i = 0 ; i < round ; i++){
            String s = nStr.substring(i,i+k);
            int sInt = convertStrToNumber(s);
            if(sInt != 0 && num % sInt == 0) c++;
        }

        return c;
    }

    public static int convertStrToNumber(String s){
        int n = s.length();
        int result = 0 ;
        for(int i = 0 ; i < s.length(); i++){
            result+= Math.pow(10,n-1) * Integer.parseInt(String.valueOf(s.charAt(i)));
            n--;
        }

        return result;
    }
}
