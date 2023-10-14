package codility.binary_gap;

public class Main {
    public static void main(String[] args) {

    }
    public static int solution(int N) {
        String s = convertIntToBinary(N);
        return binaryGap(s);
    }

    public static String convertIntToBinary(int N){
        if (N == 1) return "1";

        int result = N;
        String res = "";

        while (result != 1){
            int v = result % 2;
            res = v + res;
            result/=2;
        }

        return "1" + res;
    }

    public static int binaryGap(String s){
        if (s.length() <=2 ) return 0;

        int max = -1;
        int countZero = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if (!String.valueOf(s.charAt(i)).equals("1")) countZero++;
            else {
                if(max < countZero) max = countZero;
                countZero = 0 ;
            }
        }

        return max;
    }
}
